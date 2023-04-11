/*
 * Program:		Printf_Demo2.java
 * Purpose:		learn different printf specifiers
 * Author:		Jeff Mumford
 * Date:			Jan 24, 2023
 */

public class Printf_Demo2
{

	public static void main(String[] args)
	{
		
		//Character Printing
		//lower case %c will print in case that the char is already in
		char ch = 'a';
		System.out.printf("%c", ch);
		System.out.println();
		System.out.printf("%c", 'a');
		
		//Converting lowercase to uppercase - 
		System.out.println();
		System.out.printf("%C", 'a');
		
		//%s is for string
		//Capital S will print in uppercase
		System.out.println();
		System.out.printf("%s", "Hello");
		
		System.out.println();
		System.out.printf("%S", "Hello");
		
		
		//%h accesses the address
		System.out.println();
		System.out.printf("%h", "Hello");
		
		System.out.println();
		System.out.printf("%H", "Hello");
		
		//%x hexidecimal numbers	
		System.out.println();
		System.out.printf("%x", 10);
		
		System.out.println();
		System.out.printf("%X", 15);
		
		//%a convert floating to hexidecimal
		System.out.println();
		System.out.printf("%a", 10.56);
		
		System.out.println();
		System.out.printf("%A", 10.56);
		
		//%o octal 
		System.out.println();
		System.out.printf("%o", 10);
		
		//%f floating point
		System.out.println();
		System.out.printf("%f", 10.56);
		
		System.out.println();
		System.out.printf("%.2f", 10.56);
		
		//Boolean
		System.out.println();
		System.out.printf("%b", 4 > 5);
		
		System.out.println();
		System.out.printf("%B", 4 < 5);
		
		System.out.println();
		//System.out.printf("%b", null);
		
		System.out.println();
		System.out.printf("%b", "Hello");
		
		//%e exponential
		System.out.println();
		System.out.printf("%e", 10.567);
		
		System.out.println();
		System.out.printf("%E", 1000.567);
		
	  //%n new line
		System.out.println();
		System.out.printf("%n");
		
		//%56 to print percentage sign - add an extra %
		System.out.println();
		System.out.printf("%%56");
		
		
		
		
		

	}
	// end main
}
 //end class