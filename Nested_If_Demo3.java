/*
 * Program:		Nested_If_Demo3.java
 * Purpose:		////Fill Out///
 * Author:		Jeff Mumford
 * Date:			Jan 24, 2023
 */

import java.util.Scanner;

public class Nested_If_Demo3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final double WEIGHT = 50.0;
		final double HEIGHT = 150.0;
		final int IQ = 100;
		
		
		
		
		
		System.out.println("Enter your weight in KG's: ");
		double userWeight = input.nextDouble();
		
		if ((userWeight >= WEIGHT)){
			System.out.println("Eligable Weight");
			System.out.println("Enter your height: ");
			double userHeight = input.nextDouble();
			
			if (userHeight >= HEIGHT) {
				System.out.println("Enter your IQ: ");
				int iq = input.nextInt();	
				if (iq >= IQ) {
					System.out.println("Eligable IQ");
				}
				else {
					System.out.println("Ineligable IQ");
				}
			}
			else {
				System.out.println("Ineligable Height.");
			}
			}
		else {
			System.out.println("Not eligable, weight is less than 50 KG");
		}
		
		
		//System.out.println(userWeight);
		//System.out.println(userHeight);
		//System.out.println(iq);
		
		
		
		
		
		
    input.close();
	}
	// end main
}
 //end class
