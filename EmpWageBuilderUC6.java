package com.bl.pract;

public class EmpWageBuilderUC6 {

		// TODO Auto-generated method stub
		static final int IS_FULL_TIME=2;
		static final int IS_PART_TIME=1;
		static final int NO_OF_WORKING_DAYS=2;
		static int WAGE_PER_HR=20;
		static final int MAX_HR_IN_MNTH=10;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int FULL_DAY_HR=0;
			int wage=0;
			int totalWage=0,TOTALWORKINGDAYS=0;
				System.out.println("Welcome to Employee Wage Computation");
				while(FULL_DAY_HR<=MAX_HR_IN_MNTH && TOTALWORKINGDAYS<NO_OF_WORKING_DAYS){
					TOTALWORKINGDAYS++;
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
				 totalWage += wage;
				 System.out.println("Employee wage is "+wage);
				}
				 System.out.println("Total Employee wage is "+totalWage);
	}
	}


