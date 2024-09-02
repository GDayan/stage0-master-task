package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = -1; // Invalid month
        }
        if (days == -1) {
            System.out.println("invalid date");
        } else {
            System.out.println("Number of days in month: " + days);
        }
    }

}
