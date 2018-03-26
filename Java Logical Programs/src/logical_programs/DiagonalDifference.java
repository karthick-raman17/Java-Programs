package logical_programs;

import java.util.Scanner;

class DiagonalDifference {

	private static Scanner scanObject;

	public int difference(int arr[][], int matrixSize) {
		int diagonalOne = 0, diagonalTwo = 0;
		for (int i = 0; i < matrixSize; i++) {
			diagonalOne += arr[i][i];
			diagonalTwo += arr[i][matrixSize - i - 1];
		}
		return Math.abs(diagonalOne - diagonalTwo);
	}

	public static void main(String[] args) {
		scanObject = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		int matrixSize = scanObject.nextInt();
		int[][] array = new int[matrixSize][matrixSize];
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				array[i][j] = scanObject.nextInt();
			}
		}

		System.out.println(new DiagonalDifference().difference(array, matrixSize));

	}
}