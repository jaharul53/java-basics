package com.johurulIslam.main.oop.model;

import java.util.List;

public class Faculty extends People{
    public List<String> classList;

    public Faculty(String name, String id, List<String>subjectList, List<String> classList){
        super(name, id, subjectList);
        this.classList = classList;
    }

    @Override //Run time polymorphism must inherite and same perameter
    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subjects: " + subjectList);
        System.out.println("Class List: " + classList);
    }
    //Overloading or Compile time polymorphism  diffrent perameter
    public void printDetails(String name, String id){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
