package com.BridgeLabz.empWage;

public class DailyWage {

	public static void main(String[] args) {
		int PRESENT=1;
		int PER_HOUR=20;

		int emphrs=0;
		int empwage=0;

		double empCheck=Math.floor(Math.random()*10%2);

		if(empCheck==PRESENT)
			emphrs=8;
		else
			emphrs=0;
		empwage=emphrs*PER_HOUR;

		System.out.println("Employee Wage ="+empwage);

	}

}
