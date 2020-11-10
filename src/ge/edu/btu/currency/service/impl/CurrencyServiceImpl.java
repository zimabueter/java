package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {
    private double exchangeRate = 5;


    @Override
    public double convert(double amount) {

        return amount / exchangeRate;
    }


    @Override
    public void setExchangeRate(double value) {
        if (value <=0){
            System.out.println("შეიყვანეთ სწორი გადაცვლის კურსი ");
        }else exchangeRate = value;
    }

    @Override
    public void setExchangeRate(int value) {
        if (value <=0){
            System.out.println("შეიყვანეთ სწორი გადაცვლის კურსი ");
        }else exchangeRate = value;
    }
}
