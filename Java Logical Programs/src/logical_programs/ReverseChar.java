package logical_programs;

import java.util.Scanner;

public class ReverseChar { ///Reverse the first and last character of the String

	private static Scanner scannerObject;

	public static void main(String[] args) {

		scannerObject = new Scanner(System.in);
		System.out.println("Enter the string:\n");
		String inputString = scannerObject.nextLine();	
		
		if (inputString.length() > 1) {
			char[] chars = inputString.toCharArray();
			char first = chars[0];
			chars[0] = chars[chars.length - 1];
			chars[chars.length - 1] = first;
			inputString = new String(chars);
		}
		
			System.out.println("\n"+inputString);
		
	}
}
