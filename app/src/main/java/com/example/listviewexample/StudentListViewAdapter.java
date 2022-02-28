package com.example.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentListViewAdapter extends BaseAdapter {

    ArrayList<Student> students;
    Context context;

    StudentListViewAdapter(Context context,ArrayList<Student> students) {
        this.students = students;
        this.context = context;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Student getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(this.context).inflate(R.layout.student_info_item, viewGroup, false);

        TextView name = view.findViewById(R.id.student_name);
        TextView age = view.findViewById(R.id.student_age);

        name.setText(students.get(i).name);
        age.setText(students.get(i).age);


        return view;
    }
}
