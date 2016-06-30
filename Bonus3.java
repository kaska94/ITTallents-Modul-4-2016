import java.util.Scanner;

public class Bonus3 {

	public static void main(String[] args) {
		// Task6
		/*
		 * 
		 * Напишете програма, която за дадена матрица намира произведението на
		 * елементите под главния диагонал
		 */
		Scanner sc = new Scanner(System.in);
		int rows = 0, columns = 0;
		int[][] arrayOfInt;
		int multiplicationOfSearchedNumbers = 1;

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
		System.out.println();
		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < rowIndex; columnIndex++) {
				multiplicationOfSearchedNumbers *= arrayOfInt[rowIndex][columnIndex];
			}
		}

		System.out.println("Multiplication is " + multiplicationOfSearchedNumbers);
	}

}
