/*
 * Program:		Nested_If_Demo2.java
 * Purpose:		////Fill Out///
 * Author:		Jeff Mumford
 * Date:			Jan 24, 2023
 */

import java.util.Scanner;

public class Nested_If_Demo2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final double WEIGHT = 50.0;
		final double HEIGHT = 150.0;
		final int IQ = 100;
		
		System.out.println("Enter your weight in KG's, height in CM's and IQ:");
		
		double userWeight = input.nextDouble();
		double userHeight = input.nextDouble();
		int iq = input.nextInt();
		
		if ((userWeight >= WEIGHT)&&(userHeight >= HEIGHT)&& (iq >= IQ)){
			System.out.println("You are eligable to apply for this job");
			
		}
		
		
		//System.out.println(userWeight);
		//System.out.println(userHeight);
		//System.out.println(iq);
		
		
		
		
		
		
    input.close();
	}
	// end main
}
 //end class
