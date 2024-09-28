package com.johurulIslam.main.designpatterns;

import com.johurulIslam.main.designpatterns.logic.TaxCalculationLogic;

public class RegularCitizen {
    private String name;
    private Integer income;
    private Integer taxRate;

    public RegularCitizen(String name, Integer taxRate, Integer income) {
        this.name = name;
        this.taxRate = taxRate;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getAnnualTax(){
        TaxCalculationLogic taxCalculationLogic = TaxCalculationLogic.getInstance();
        return taxCalculationLogic.calculateTax(income,taxRate);
    }

}
