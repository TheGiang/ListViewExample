package com.example.listviewexample;

import java.util.ArrayList;

public class Student {

    String name, age;

    Student() {
        this.name = "";
        this.age = "";
    }

    Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    static ArrayList<Student> genData() {
        ArrayList<Student> result = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            result.add(new Student("Giang" + i, "20" + i));
        }

        return result;
    }

}
