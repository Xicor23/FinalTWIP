package com.company;

/**
 * Created by Will YE on 4/23/2017.
 */
public class Student {
    public int secret;
    public Student(int a){
        secret=a;
    }
    public double frq1 = -1;
    public double frq2 = -1;
    public void r1(double n){
        if(frq1 != -1)
            frq1 = (frq1 + n) / 2;
        else
            frq1 = n;
    }
    public void r2(double n){
        if(frq2 != -1)
            frq2 = (frq2 + n) / 2;
        else
            frq2 = n;
    }
    public String name = "";
    public void setName(String n){
        name = n;
    }
    public void printInfo(){
        System.out.printf("%-15s %-15s %-15s %-15s", "Student " + secret, "FR #1", "FR #2", "Total");
        System.out.println();
        System.out.printf("%-15s %-15s %-15s %-15s", name, frq1, frq2, frq1 + frq2);
    }
}
