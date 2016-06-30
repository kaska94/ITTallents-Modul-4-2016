import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0, columns = 0;
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
			System.out.println();
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.print(arrayOfInt[rowIndex][columnIndex] + " ");
			}
		}

		int ninetyDegreeColumn = 0;
		int[][] newArrayOfInt = new int[rows][columns];
		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				ninetyDegreeColumn = (arrayOfInt[rowIndex].length - rowIndex - 1);
				newArrayOfInt[columnIndex][ninetyDegreeColumn] = arrayOfInt[rowIndex][columnIndex];
			}
		}
		System.out.println();

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			System.out.println();
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.print(newArrayOfInt[rowIndex][columnIndex] + " ");
			}
		}

	}
}
