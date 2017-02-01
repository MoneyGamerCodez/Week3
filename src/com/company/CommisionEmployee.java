package com.company;

import java.time.LocalDate;

/**
 * Created by Thomas on 2017-01-25.
 */
public class CommissionEmployee extends Employee {
    private double monthlySales, commisionRate;

    public CommissionEmployee(String first, String last, int sin, LocalDate dob,double commRate) {
        super(first, last, sin, dob);
        monthlySales = 0;

        setCommRate(commRate);
    }

    public void setCommRate(double commRate)
    {
        if (commRate > 0 && commRate < 60)
            commisionRate = commRate;
        else
            throw new IllegalArgumentException("Commissions must be set between 0 - 60");
    }
    public void addSales (double newSalesAmount)
    {
        if(newSalesAmount > 0)
            this.monthlySales += newSalesAmount;
        else
            throw new IllegalArgumentException("invalid amount");
    }

    @Override
    public PayCheque getPayCheque() {
        double payAmount = commisionRate/100 * monthlySales;

        PayCheque newPay = new PayCheque(super.toString(), payAmount, "commission pay");

        monthlySales = 0;
        return newPay;


    }
}
