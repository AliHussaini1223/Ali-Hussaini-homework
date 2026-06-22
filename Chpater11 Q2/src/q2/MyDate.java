/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author S C S
 */
public class MyDate {
    private int month, day, year;

    public MyDate() {
        this.month = 1;
        this.day = 1;
        this.year = 2023;
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

}
