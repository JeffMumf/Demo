/*
 * Program:		Switch_Demo2.java
 * Purpose:		////Fill Out///
 * Author:		Jeff Mumford
 * Date:			Jan 25, 2023
 */

import java.util.Scanner;

public class Switch_Demo2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which of the following primatives uses the most memory?"
				+ "\nA: byte"
				+ "\nB: short"
				+ "\nC: int"
				+ "\nD: long"
				+ "\nEnter your choice:");
		//String ch = input.next();
		char ch = input.next().charAt(0);
		
		switch(ch)
		{
		case 'A':
			System.out.println("Incorrect");
			break;
		case 'B':
			System.out.println("Incorrect");
			break;
		case 'C':
			System.out.println("Incorrect");
			break;
		case 'D':
			System.out.println("correct");
			break;
		default:
			System.out.println("Please enter A,B,C or D.");
			
		}
		

				
		input.close();
	}
	// end main
}
 //end class