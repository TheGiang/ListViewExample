package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView stdListView;
    StudentListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new StudentListViewAdapter(this, Student.genData());
        stdListView = findViewById(R.id.student_listview);

        stdListView.setAdapter(adapter);


    }
}