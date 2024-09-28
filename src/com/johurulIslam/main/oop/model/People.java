package com.johurulIslam.main.oop.model;

import java.util.List;

    public class People {
    public String name;
    public String id;
    public List<String> subjectList;

    public People(String name, String id, List<String> subjectList){
        this.name = name;
        this.id = id;
        this.subjectList = subjectList;
    }
    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subjects: " + subjectList);
    }
}
