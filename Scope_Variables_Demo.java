/*
 * Program:		Scope_Variables_Demo.java
 * Purpose:		TO understand the scope of variables
 * Author:		Jeff Mumford
 * Date:			Jan 25, 2023
 */

public class Scope_Variables_Demo	//Class
{//Class starts

	public static void main(String[] args)	//Main
	{//main starts
		int num1 = 5;	//available in all braces
		System.out.println(num1);
		
		{//outer braces start
			String str1 = "Hi";	//only available in outer and inner braces
			
			{//inner braces start
				char ch = 'a';	//only available in inner braces
				System.out.println(ch);
				System.out.println(num1);
				System.out.println(str1);
			}//end of inner braces
			
		}//end of outer braces

	}// end main
}//end class