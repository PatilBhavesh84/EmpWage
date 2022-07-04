package com.BridgeLabz.empWage;

public class MonthWage {

	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int WORKING_DAYS = 20;

	public static void main(String[] args) {

		int totalWage = 0;
		for (int day = 1; day <= WORKING_DAYS; day++)
		{

			int empCheck= (int) Math.floor(Math.random()*10%3);
			int workingHours =0;
			switch (empCheck)
			{
			case FULL_TIME:
				workingHours = 8;
				break;
			case PART_TIME:
				workingHours = 4;
				break;
			default:
			}
			int wage = workingHours * WAGE_PER_HR;
			System.out.println("Day " + day + " wage is:" + wage);
			totalWage += wage;
		}
		System.out.println("Total wage for a month is " + totalWage); 

	}
}