package com.bl.pract;

public class EmpWageBuilderUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int WAGE_PER_HR=20;
		int FULL_DAY_HR=8;
		int wage;
		
			System.out.println("Welcome to Employee Wage Computation");
			double empCheck=Math.floor(Math.random()*10)%2;
			if(empCheck == 1){
				FULL_DAY_HR=8;
				System.out.println("Employee is present ");
			    
			}
			else
			{
				FULL_DAY_HR=0;
				System.out.println("Employee is absent ");
				//System.out.println("Employee wage is "+wage);
			}
			 wage =WAGE_PER_HR*FULL_DAY_HR;
			 System.out.println("Employee wage is "+wage);
	}

}
