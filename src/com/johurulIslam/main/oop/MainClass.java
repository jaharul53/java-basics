package com.johurulIslam.main.oop;

import com.johurulIslam.main.oop.model.Faculty;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Faculty faculty1= new Faculty("Johurul", "53", List.of("Java","C++"),List.of("11","12"));
        faculty1.printDetails();
        faculty1.printDetails(faculty1.name, faculty1.id);
    }
}
