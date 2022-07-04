package com.BridgeLabz.empWage;

public class SwitchCase {
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int PER_HOUR=20;

	public static void main (String[] args){

		int emphrs=0;
		int empwage=0;

		int empCheck= (int) Math.floor(Math.random()*10%3);
		switch(empCheck)
		{
		case PART_TIME:
			emphrs=4;
			System.out.println("part time ");
			break;
//System.out.println("part time");
		case FULL_TIME:
			emphrs=8;
			System.out.println("full time");
			break;

		default:
			emphrs=0;
System.out.println("absent");
		}
		empwage=emphrs*PER_HOUR;

		System.out.println("Employee Wage :"+empwage);
	}

}
