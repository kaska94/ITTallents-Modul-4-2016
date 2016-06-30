import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0, columns = 0;
		int[][] arrayOfInt;
		int sum = 0, avarage;
		int elementsOnEveryRow = 0;
		
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
				sum += arrayOfInt[rowIndex][columnIndex];
			}
		}

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			elementsOnEveryRow += arrayOfInt[rowIndex].length;
		}

		avarage = sum / elementsOnEveryRow;

		System.out.println("Avarage " + avarage + "\nSum  " + sum + "\nAll the elements are " + elementsOnEveryRow);
	}
}
