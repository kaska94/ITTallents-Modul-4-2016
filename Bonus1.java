import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {
		// Task 5
		/*
		 * 5.Напишете програма, която за дадена матрица m x n от числа намира
		 * реда, в който сумата от елементите е максимална.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int rows = 0, columns = 0;
		int maxSum = 0;
		int[][] arrayOfInt;

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

		arrayOfInt = new int[rows][columns];

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.println("row " + rowIndex + " colom " + columnIndex);
				arrayOfInt[rowIndex][columnIndex] = sc.nextInt();
			}
		}

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.print(arrayOfInt[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			int tempRowSum = 0;
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				tempRowSum += arrayOfInt[rowIndex][columnIndex];
			}
			if (tempRowSum > maxSum) {
				maxSum = tempRowSum;
			}
		}
		System.out.println("Max row sum is " + maxSum);
	}

}
