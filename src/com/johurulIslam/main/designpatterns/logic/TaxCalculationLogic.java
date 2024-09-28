package com.johurulIslam.main.designpatterns.logic;

public class TaxCalculationLogic {
    public static TaxCalculationLogic instance=null;
    private TaxCalculationLogic() {
        System.out.println("Tax calculation logic Object Creat");
    }

    public static TaxCalculationLogic getInstance() {
        synchronized (TaxCalculationLogic.class) {
            if (instance == null) instance = new TaxCalculationLogic();
        }

        return instance;
    }

    public Integer calculateTax(Integer income, Integer taxRate){
        return income/taxRate;
    }
}
