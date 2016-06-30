import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 5, columns = 6;
		int[][] arrayOfInt;
		int min, max;
		
		arrayOfInt = new int[rows][columns];
		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.println("row " + rowIndex + " colom " + columnIndex);
				arrayOfInt[rowIndex][columnIndex] = sc.nextInt();
			}
		}

		min = arrayOfInt[0][0];
		max = arrayOfInt[0][0];

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				if (min > arrayOfInt[rowIndex][columnIndex]) {
					min = arrayOfInt[rowIndex][columnIndex];
				}

				if (max < arrayOfInt[rowIndex][columnIndex]) {
					max = arrayOfInt[rowIndex][columnIndex];
				}
			}
		}

		System.out.println("Min is " + min + "\n Max is " + max);

	}
}
