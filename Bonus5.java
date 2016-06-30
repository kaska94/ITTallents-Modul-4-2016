import java.util.Scanner;

public class Bonus5 {
	public static void main(String[] args) {
		/* Task 9
		 * Дадена е правоъ­гълна матрица с числа. Да се намери в нея
		 * максималната подмат­рица с размер 2 х 2 и да се отпечата на
		 * конзолата. Под максимална подматрица се разбира подматрица, която има
		 * максимална сума на елементите, които я съставят.
		 */

		Scanner sc = new Scanner(System.in);
		int rows = 0, columns = 0;
		int[][] arrayOfInts;
		int maxSum = 0;

		System.out.println("Enter rows:");
		rows = sc.nextInt();
		if ((rows < 0) || (rows > 50)) {
			System.out.println("Number must be between 0 and 50");
			return;
		}

		System.out.println("Enter columns:");
		columns = sc.nextInt();
		if ((rows < 0) || (rows > 50)) {
			System.out.println("Number must be between 0 and 50");
			return;
		}

		arrayOfInts = new int[rows][columns];

		for (int rowIndex = 0; rowIndex < arrayOfInts.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInts[rowIndex].length; columnIndex++) {
				System.out.println("row " + rowIndex + " colom " + columnIndex);
				arrayOfInts[rowIndex][columnIndex] = sc.nextInt();
			}
		}

		for (int rowIndex = 0; rowIndex < arrayOfInts.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInts[rowIndex].length; columnIndex++) {
				System.out.print(arrayOfInts[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int rowIndex = 0; rowIndex < (arrayOfInts.length - 1); rowIndex++) {
			for (int columnIndex = 0; columnIndex < (arrayOfInts[rowIndex].length - 1); columnIndex++) {
				int tempSum = 0;
				tempSum += arrayOfInts[rowIndex][columnIndex];
				tempSum += arrayOfInts[rowIndex][columnIndex + 1];
				tempSum += arrayOfInts[rowIndex + 1][columnIndex];
				tempSum += arrayOfInts[rowIndex + 1][columnIndex + 1];
				if (maxSum < tempSum) {
					maxSum = tempSum;
				}
			}
			System.out.println();
		}
		System.out.println("Max sum is of 2x2 square is  " + maxSum);

	}
}
