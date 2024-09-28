package com.johurulIslam.main.designpatterns;

public class MainClass {
    public static void main(String[] args) {
        RegularCitizen regularCitizen=new RegularCitizen("Johurul",10,100000);
        RegularCitizen regularCitizen2=new RegularCitizen("arif",10,700000);
        RegularCitizen regularCitizen3=new RegularCitizen("munna",10,600000);
        GovtCitizen govtCitizen=new GovtCitizen("Jabad",15000);
        GovtCitizen govtCitizen2=new GovtCitizen("Jakir",13000);
        GovtCitizen govtCitizen3=new GovtCitizen("Jahidul",10000);
        System.out.println(regularCitizen.getAnnualTax());
        System.out.println(regularCitizen2.getAnnualTax());
        System.out.println(regularCitizen3.getAnnualTax());
        System.out.println(govtCitizen.getAnnualTax());
        System.out.println(govtCitizen2.getAnnualTax());
        System.out.println(govtCitizen3.getAnnualTax());


    }
}
