package com.johurulIslam.main.designpatterns.prototype;

public class MainClass {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student.getStudentList());
        ///it takes 5sec to load data
        student.loadData();
        System.out.println(student.getStudentList());
//        Student student2=student;
//        //5 sec
////        student2.loadData();
//        student2.addStudent(15);
//        System.out.println(student2.getStudentList());
//        System.out.println(student.getStudentList());
        Student student3= (Student) student.getClone();
        student3.addStudent(20);
        student.addStudent(17);
        System.out.println(student.getStudentList()+" student ");
        System.out.println(student3.getStudentList()+" student 3");


    }
}
