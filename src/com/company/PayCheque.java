package com.company;

import java.time.LocalDate;

/**
 * Created by Thomas on 2017-01-25.
 */
public class PayCheque {
    private LocalDate dateIssued;
    private String employeeName;
    private double amount;
    private String memo;
    private int chequeNumber;
    private static int nextChequeNumber = 10001;

    public PayCheque(LocalDate dateIssued, String employeeName, double amount, String memo) {
        this.dateIssued = dateIssued;
        this.employeeName = employeeName;
        this.amount = amount;
        this.memo = memo;
        chequeNumber = nextChequeNumber;

        nextChequeNumber++;
    }



}
