package com.example.zarzdzaniaplanemzaj;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddTask = findViewById(R.id.btnAddTask);
        Button btnCustomizeMenu = findViewById(R.id.btnCustomizeMenu);
        Button btnViewStats = findViewById(R.id.btnViewStats);

        btnAddTask.setOnClickListener(this);
        btnCustomizeMenu.setOnClickListener(this);
        btnViewStats.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        final int btnAddTaskId = R.id.btnAddTask;
        final int btnCustomizeMenuId = R.id.btnCustomizeMenu;
        final int btnViewStatsId = R.id.btnViewStats;

        switch (id) {
            case btnAddTaskId:
                // Handle adding a task to the schedule
                break;
            case  btnCustomizeMenuId:
                // Handle customizing the menu
                break;
            case  btnViewStatsId:
                // Handle viewing statistics and reports
                break;
        }
    }
}
