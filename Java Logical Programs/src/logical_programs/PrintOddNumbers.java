package logical_programs;

public class PrintOddNumbers {

	public static void main(String[] args) {
		int i = 1;

		while (i <= 30) {
			System.out.println(i);
			i++;

			if ((i % 2) == 0) {
				i++;
			}

		}
	}
}