package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	Employee employee1 = new Employee("Fred","Flintstone",1234, LocalDate.of(1998, Month.MARCH, 14));
        Employee employee2 = new Employee("Thomas","Ratulowski",1234, LocalDate.of(1998, Month.MAY, 8));//set as year-month-date


	System.out.printf("Employee1 is %s%n", employee1);
	System.out.printf("The employee was born on %s, that was a %s%n", employee1.getDateOfBirth(),employee1.getDateOfBirth().getDayOfWeek());

        System.out.printf("Employee2 is %s%n", employee1);
        System.out.printf("The employee was born on %s, that was a %s%n", employee2.getDateOfBirth(),employee2.getDateOfBirth().getDayOfWeek());
    }
}
