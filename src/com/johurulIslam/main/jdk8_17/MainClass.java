package com.johurulIslam.main.jdk8_17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MainClass {
    public static void main(String[] args) {
//        Function<Integer, Integer> multiplyByTwo=(num)->num*2;
//        System.out.println(multiplyByTwo.apply(2));
//        BiFunction<Integer,Integer, Integer> multiply=(num,num2)->num*num2;
//        System.out.println(multiply.apply(2,3));
//        TriFunction<Integer,Integer,Integer,Integer> calculate=(num,num2,num3)->num*num2+num3;
//        System.out.println(calculate.apply(3,2,10));
        User user1=new User("Johurul", "201","BD");
        User user2=new User("Jabad", "202","IND");
        User user3=new User("Jakir", "203","BD");
        User user4=new User("Jaman", "211","JP");
        ArrayList<User>userArrayList=new ArrayList<>();
        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        List<User>selectedUser=userArrayList.stream().filter((user)-> user.getCountry().equals("BD")).toList();
        System.out.println(selectedUser);
        List<String>selectedUserNames=userArrayList.stream().map((user)-> {
            if(user.getCountry().equals("BD")) return user.getUserName();
            return null;
        }).filter((name)->name!=null).toList();
        System.out.println(selectedUserNames);


    }
}
