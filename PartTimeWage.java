package com.BridgeLabz.empWage;

public class PartTimeWage {

	public static void main(String[] args) {
		int PART_TIME=1;
		int FULL_TIME=2;
		int PER_HOUR=20;

		int emphrs=0;
		int empwage=0;

		double empCheck=Math.floor(Math.random()*10%3);

		if(empCheck==PART_TIME)
			emphrs=4;
		else if(empCheck==FULL_TIME)
			emphrs=8;
		else
			emphrs=0;

		empwage=emphrs*PER_HOUR;

		System.out.println("Employee Wage :"+empwage);
	}

}
