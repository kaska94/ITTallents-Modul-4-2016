import java.util.Scanner;

public class Bonus7a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0, columns = 0;
		int[][] arrayOfInts;
		int counter = 1;
		System.out.println("Enter rows:");
		rows = sc.nextInt();
		if ((rows <= 1) && (rows >= 50)) {
			System.out.println("Number must be between 1 and 50");
			return;
		}

		System.out.println("Enter columns:");
		columns = sc.nextInt();
		if ((rows < 0) && (rows > 50)) {
			System.out.println("Number must be between 0 and 50");
			return;
		}

		arrayOfInts = new int[rows][columns];

		for (int rowIndex = 0; rowIndex < arrayOfInts.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInts[rowIndex].length; columnIndex++) {
				arrayOfInts[rowIndex][columnIndex] = counter;
				counter++;
			}
		}

		System.out.println("Normal");
		for (int rowIndex = 0; rowIndex < arrayOfInts.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInts[rowIndex].length; columnIndex++) {
				System.out.print(arrayOfInts[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}

		System.out.print("\nVertical");
		int[][] verticalIntArray = new int[rows][columns];
		int rowVertical = 0, columnVertical = 0;

		for (int rowIndex = 0; rowIndex < arrayOfInts.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInts[rowIndex].length; columnIndex++) {
				if (rowVertical < rows) {
					verticalIntArray[rowVertical][columnVertical] = arrayOfInts[rowIndex][columnIndex];
					rowVertical++;
				} else {
					if (rowVertical == rows) {
						columnVertical++;
						rowVertical = 0;
						verticalIntArray[rowVertical][columnVertical] = arrayOfInts[rowIndex][columnIndex];
						rowVertical++;
					}
				}

			}
			System.out.println();
		}

		for (int rowIndex = 0; rowIndex < verticalIntArray.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < verticalIntArray[rowIndex].length; columnIndex++) {
				System.out.print(verticalIntArray[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}

	}

}
