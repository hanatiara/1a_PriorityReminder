package com.example.a1_priorityreminder;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class taskData extends AppCompatActivity {
    private TextView getTitle, getDate, getDetail;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        getSupportActionBar().setTitle("Task Detail");
        getTitle = findViewById(R.id.gettitle);
        getDate = findViewById(R.id.getdate);
        getDetail = findViewById(R.id.getdetail);
        showData();
    }

    private void showData() {
        String task = getIntent().getExtras().getString("Title");

        switch (task) {
            case "PR Matematika Hal 23":
                getTitle.setText("PR Matematika Hal 23");
                getDate.setText("");
                getDetail.setText("");
                break;

            case "Tugas Seni Budaya Teater":
                getTitle.setText("Tugas Seni Budaya Teater");
                getDate.setText("");
                getDetail.setText("");
                break;

            case "Presentasi Sejarah":
                getTitle.setText("Presentasi Sejarah");
                getDate.setText("");
                getDetail.setText("");
                break;
        }
    }
}
