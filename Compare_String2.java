/*
 * Program:		Compare_String2.java
 * Purpose:		////Fill Out///
 * Author:		Jeff Mumford
 * Date:			Jan 25, 2023
 */

public class Compare_String2
{

	public static void main(String[] args)
	{
		String str1 = "B";
		String str2 = "a";
		
		
		//CompareTo()
		if (str1.compareTo(str2) == 0){	//0
			System.out.println("Str1 is equal to str2");
		}
		else {
			System.out.println("Str1 is NOT equal to str2");
		}
		if (str1.compareTo(str2) > 0){	// positive integer
			System.out.println("Str2 comes first");
			System.out.println("Str1 is NOT equal to str2");
		}
		if (str1.compareTo(str2) < 0){	//negative integer
			System.out.println("Str1 comes first");
			System.out.println("Str1 is NOT equal to str2");
		}

	}
	// end main
}
 //end class