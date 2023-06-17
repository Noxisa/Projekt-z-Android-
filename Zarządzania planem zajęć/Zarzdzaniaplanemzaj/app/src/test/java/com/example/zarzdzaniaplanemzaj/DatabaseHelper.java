package com.example.zarzdzaniaplanemzaj;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper  extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ScheduleManager.db";
    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_TABLE_TASKS = "CREATE TABLE tasks ("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "name TEXT,"
            + "time TEXT)";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_TASKS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tasks");
        onCreate(db);
    }
}