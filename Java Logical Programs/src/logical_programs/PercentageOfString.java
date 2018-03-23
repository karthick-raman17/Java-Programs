package logical_programs;

public class PercentageOfString {
	void characterPercentage() {
		String inputString = "K@r thic k123";
		int totalChars = inputString.length();

		int upperCaseLetters = 0;

		int lowerCaseLetters = 0;

		int digits = 0;
		int spaces = 0;
		int others = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseLetters++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseLetters++;
			}
			else if (Character.isDigit(ch)) {
				digits++;
			} else if (Character.isWhitespace(ch)) {
				spaces++;
			} else {
				others++;
			}
		}
		
		double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars;
		double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
		double digitsPercentage = (digits * 100.0) / totalChars;
		double otherCharPercentage = (others * 100.0) / totalChars;
		double spacePercentage= (spaces*100.0)/totalChars;

		System.out.println("Input String: " + inputString);
		System.out.println("Uppercase letters " + upperCaseLetterPercentage + "% ");
		System.out.println("Lowercase letters " + lowerCaseLetterPercentage + "%");
		System.out.println("Digits " + digitsPercentage + "%");
		System.out.println("Spaces "+ spacePercentage +"%" );
		System.out.println("Other Characters " + otherCharPercentage + "%");
		

	}

	public static void main(String[] args) {
		new PercentageOfString().characterPercentage();
	}

}