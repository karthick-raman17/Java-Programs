package logical_programs;

import java.util.Scanner;

public class VeryBigSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		long total = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			total += arr[arr_i];
		}
		System.out.println(total);
	}
}