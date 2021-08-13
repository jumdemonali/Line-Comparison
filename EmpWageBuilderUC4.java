package com.bl.pract;

public class EmpWageBuilderUC4 {
	static final int IS_FULL_TIME=2;
	static final int IS_PART_TIME=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int WAGE_PER_HR=20;
		int FULL_DAY_HR=0;
		int wage=0;
			System.out.println("Welcome to Employee Wage Computation");
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
				case IS_PART_TIME: 
				FULL_DAY_HR=4;
				System.out.println("Employee is present part time ");		    
				break;
				case IS_FULL_TIME: 
				FULL_DAY_HR=8;
				System.out.println("Employee is present full time ");		    
				break;
			default: 
				FULL_DAY_HR=0;
				System.out.println("Employee is absent ");		    
				break;
			}
			 wage =WAGE_PER_HR*FULL_DAY_HR;
			 System.out.println("Employee wage is "+wage);
	
	}
}
