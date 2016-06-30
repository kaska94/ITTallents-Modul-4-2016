import java.util.Scanner;

public class Bonus4 {

	public static void main(String[] args) {
		/*
		 * Task 8
		 * Напишете програма, която за матрица от булеви стойности, проверява
		 * дали се съдържа елемент със стойност true над втория диагонал.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int rows = 0, columns = 0;
		boolean[][] arrayOfBooleans;
		boolean isFound = false;

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

		arrayOfBooleans = new boolean[rows][columns];

		for (int rowIndex = 0; rowIndex < arrayOfBooleans.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfBooleans[rowIndex].length; columnIndex++) {
				System.out.println("row " + rowIndex + " colom " + columnIndex + "(true or false)");
				arrayOfBooleans[rowIndex][columnIndex] = sc.nextBoolean();
			}
		}

		for (int rowIndex = 0; rowIndex < arrayOfBooleans.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfBooleans[rowIndex].length; columnIndex++) {
				System.out.print(arrayOfBooleans[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int rowIndex = 0; rowIndex < arrayOfBooleans.length; rowIndex++) {
			for (int columnIndex = rowIndex + 1; columnIndex < arrayOfBooleans[rowIndex].length; columnIndex++) {
				if (arrayOfBooleans[rowIndex][columnIndex] == true) {
					isFound = true;
				}
			}
		}

		if (isFound) {
			System.out.println("It Exist");
		} else {
			System.out.println("It Desn't exist");
		}

	}

}
