package logical_programs;

import java.util.Scanner;

public class SlashPattern {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Rows?");
		try {
			int rows = scannerObject.nextInt();

			for (int i = 0; i < rows; i++) {

				for (int j = 0; j < rows; j++) {

					if (i == j) {
						System.out.print("ssssss1");
					} else {
						System.out.print(0);
					}
				}

				System.out.println();
			}

		} catch (Exception e) {

		} finally {
			scannerObject.close();
		}
	}

}
