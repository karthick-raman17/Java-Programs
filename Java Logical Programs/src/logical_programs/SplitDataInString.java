package logical_programs;

import java.util.StringTokenizer;

class SplitDataInString {
	
	public static void main(String args[]) {
		String in = "Firstname:Karthick, Lastname:Raman, Phone:9876543210, City:Chennai";

		StringTokenizer stringTokenObject = new StringTokenizer(in, ": ,");
		while (stringTokenObject.hasMoreTokens()) {
			String key = stringTokenObject.nextToken();
			String value = stringTokenObject.nextToken();
			System.out.println(key + " \t " + value);
		}
	}
}