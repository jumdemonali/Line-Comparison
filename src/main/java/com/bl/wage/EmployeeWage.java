package com.bl.wage;

public class EmployeeWage
{
    public static void main(String args[])
    {
        int IS_FULL_TIME=2;
        int IS_PART_TIME=1;
        int WAGE_PER_HR=20;
        int FULL_DAY_HR=0;
        int wage=0;
        System.out.println("Welcome to Employee Wage Computation");
        double empCheck=Math.floor(Math.random()*10)%3;
        if(empCheck == IS_PART_TIME){
            FULL_DAY_HR=4;
            System.out.println("Employee is present part time ");
        }
        else if(empCheck == IS_FULL_TIME)
        {
            FULL_DAY_HR=8;
            System.out.println("Employee is present full time ");
        }
        else
        {
            FULL_DAY_HR=0;
            System.out.println("Employee is absent ");
        }
        wage =WAGE_PER_HR*FULL_DAY_HR;
        System.out.println("Employee wage is "+wage);
    }
}