package com.hust.kstn.parameters;

public class Student {
    private int studentId;
    private String name;

    public Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    void Student(int studentid, String name) {
    	this.studentId = studentid;
    	this.name = name;
    }
}