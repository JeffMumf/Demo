/*
 * Program:		Printf_Demo.java
 * Purpose:		Working with formatted printing
 * Author:		Jeff Mumford
 * Date:			Jan 24, 2023
 */

public class Printf_Demo
{

	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 6;
		int add = num1 + num2;
		System.out.println("The addition of " + num1 + " and " + num2 + " is " + add);
		System.out.printf("The addition of %d and %d is %d\n", num1, num2, add);

	}
	// end main
}
 //end class