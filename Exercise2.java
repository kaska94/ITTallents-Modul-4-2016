import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dimention = 0;
		int[][] arrayOfInt;

		System.out.println("Enter dimention:");
		dimention = sc.nextInt();
		if ((dimention < 0) || (dimention > 50)) {
			System.out.println("Number must be between 0 and 50");
			return;
		}

		arrayOfInt = new int[dimention][dimention];
		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.println("row " + rowIndex + " colom " + columnIndex);
				arrayOfInt[rowIndex][columnIndex] = sc.nextInt();
			}
		}
		
		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.print(arrayOfInt[rowIndex][columnIndex]);
			}
			System.out.println();
		}

		System.out.println("First:");
		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				if (rowIndex == columnIndex) {
					System.out.print(arrayOfInt[rowIndex][columnIndex] + " ");
				}
			}
		}

		System.out.println("\nSecond:");
		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				if ((rowIndex + columnIndex) == (arrayOfInt.length-1)) {
					System.out.print(arrayOfInt[rowIndex][columnIndex] + " ");
				}
			}
		}

	}
}
