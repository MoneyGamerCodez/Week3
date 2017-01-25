package com.company;

import java.time.LocalDate;

/**
 * Created by Thomas on 2017-01-25.
 */
public class HourlyEmployee extends Employee {

    public HourlyEmployee(String first, String last, int sin, LocalDate dob) {
        super(first, last, sin, dob);
    }

    @Override
    public PayCheque getPayCheque() {
        return null;
    }
}
