package com.johurulIslam.main.designpatterns;

import com.johurulIslam.main.designpatterns.logic.TaxCalculationLogic;

public class GovtCitizen {
    private String name;
    private Integer income;

    public GovtCitizen(String name, Integer income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getAnnualTax(){
       TaxCalculationLogic taxCalculationLogic=TaxCalculationLogic.getInstance();
        return taxCalculationLogic.calculateTax(income,5);
    }

}
