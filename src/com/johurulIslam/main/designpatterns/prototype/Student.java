package com.johurulIslam.main.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Prototype{
    private ArrayList<Integer> studentList;

    public Student() {
        studentList=new ArrayList<Integer>();
    }

    public Student(ArrayList<Integer> studentList) {
        this.studentList = studentList;
    }
    public void loadData(){
        studentList.add(1);
        studentList.add(2);
        studentList.add(3);
        studentList.add(4);
    }
    public ArrayList<Integer> getStudentList() {
        return studentList;
    }
    public void addStudent(Integer student) {
        studentList.add(student);
    }

    @Override
    public Prototype getClone() {
        ArrayList<Integer> arrayList=new ArrayList<>(this.getStudentList());

        return new Student(arrayList);
    }
}
