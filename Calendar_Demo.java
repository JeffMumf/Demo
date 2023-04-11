/*
 * Program:		Calendar_Demo.java
 * Purpose:		Print the current date and time
 * Author:		Jeff Mumford
 * Date:			Jan 24, 2023
 */

import java.util.Calendar;
public class Calendar_Demo
{

	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();		//create calendar object
	  // \t for tab, %t for date/time
		System.out.printf("%tB %te, %tY, %tA %tl:%tM %tp", cal, cal, cal, cal, cal, cal, cal);	
		//lower case prints short form	
		
	}// end main
}//end class