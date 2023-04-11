/*
 * Program:		Compare_String_Demo.java
 * Purpose:		////Fill Out///
 * Author:		Jeff Mumford
 * Date:			Jan 24, 2023
 */

public class Compare_String_Demo
{

	public static void main(String[] args)
	{
		String str1 = "Jeff";
		String str2 = "jeff";
		
		//Relational Operator
		if (str1 == str2) {
			System.out.println("Str1 is equal to str2");
		}
		else {
			System.out.println("Str1 is NOT equal to str2");
		}
		
		System.out.println();
		

	  //Equals Method
		if (str1.equals(str2)) {
			System.out.println("Str1 is equal to str2");
		}
		else {
			System.out.println("Str1 is NOT equal to str2");
		}
		
		System.out.println();
		
		//Equals IgnoreCase Method
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Str1 is equal to str2");
		}
		else {
			System.out.println("Str1 is NOT equal to str2");
		}

		System.out.println();
		
		//CompareTo()
		if (str1.compareTo(str2) == 0){
			System.out.println("Str1 is equal to str2");
		}
		else {
			System.out.println("Str1 is NOT equal to str2");
		}
		
	  //CompareTo() IgnoreCase
		if (str1.compareToIgnoreCase(str2) == 0){
			System.out.println("Str1 is equal to str2");
		}
		else {
			System.out.println("Str1 is NOT equal to str2");
		}
		
	}
	// end main
}
 //end class