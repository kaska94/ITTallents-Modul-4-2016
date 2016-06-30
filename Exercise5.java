import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 4, columns = 4;
		int[][] arrayOfInt;
		int maxRowSum = 0, maxColumnSum = 0;

		arrayOfInt = new int[rows][columns];

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.println("row " + rowIndex + " colom " + columnIndex);
				arrayOfInt[rowIndex][columnIndex] = sc.nextInt();
			}
		}

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			int tempRowSum = 0;
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				tempRowSum += arrayOfInt[rowIndex][columnIndex];
			}
			if (tempRowSum > maxRowSum) {
				maxRowSum = tempRowSum;
			}
		}
		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.print(arrayOfInt[rowIndex][columnIndex] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("Max row sum is " + maxRowSum);

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			int tempColumnSum = 0;
			for (int indexForColumnSum = 0; indexForColumnSum < arrayOfInt.length; indexForColumnSum++) {
				tempColumnSum += arrayOfInt[indexForColumnSum][rowIndex];
			}
			if (tempColumnSum > maxColumnSum) {
				maxColumnSum = tempColumnSum;
			}
		}
		System.out.println("Max column sum is " + maxColumnSum);

		if (maxRowSum > maxColumnSum) {
			System.out.println("Max sum of rows > than max sum of columns");
		} else {
			if (maxColumnSum == maxRowSum) {
				System.out.println("Max sum of rows = than max sum of columns");
			} else {
				System.out.println("Max sum of rows < than max sum of columns");
			}
		}
	}

}
