/*
 * Program:		Bitwise_Demo.java
 * Purpose:		Understand the bitwise operations using logical operator
 * Author:		Jeff Mumford
 * Date:			Jan 25, 2023
 */

public class Bitwise_Demo
{

	public static void main(String[] args)
	{
		int num1 = 5;	//0101
		int num2 = 8;	//1000
		boolean num3 = true;
		
		int and = num1 & num2;
		System.out.println(and);
		
		int or = num1 | num2;
		System.out.println(or);
		
		int xor = num1 ^ num2;
		System.out.println(xor);
		
		boolean not = (!num3);
		System.out.println(not);

	}
	// end main
}
 //end class