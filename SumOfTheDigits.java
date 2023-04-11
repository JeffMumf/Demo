/*
 * Program:		SumOfTheDigits.java
 * Purpose:		get the sum off all digits in a 3 digit number
 * Author:		Jeff Mumford
 * Date:			Jan 25, 2023
 */

import java.util.Scanner;

public class SumOfTheDigits
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3 digit number");
		
		int num1 = input.nextInt();
		int lastDigit = num1 % 10;
		int secondDigit = (num1 / 10) % 10;
		int firstDigit = num1 / 100;
		int total = lastDigit + secondDigit + firstDigit;
		
		System.out.println(total);

	}
	// end main
}
 //end class