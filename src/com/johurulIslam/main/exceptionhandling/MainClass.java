package com.johurulIslam.main.exceptionhandling;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        System.out.println(arrayList.get(2));
//        try{
//            devide(1,0);
//        }
//        catch (Exception ex){
//            System.out.println("Spesific Exception");
//        }

        Integer personSalary = 7;
        try{
            System.out.println(calculateTax(personSalary));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Integer personSalary2 = 0;
        try{
            System.out.println(calculateTax(personSalary2));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public static float calculateTax(Integer personSalary) throws Exception {
        try{
            return (float) (15 / personSalary);
        }
        catch (Exception ex){
            throw new Exception("Invalid salary");
        }

    }

    ///Genetic Method
    public static float devide(Integer  num1,Integer num2){
        return num1/num2;
    }
}
