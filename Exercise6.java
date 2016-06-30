import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 6, columns = 6;
		int[][] arrayOfInt;
		int sumRows = 0;

		arrayOfInt = new int[rows][columns];

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
				System.out.println("row " + rowIndex + " colom " + columnIndex);
				arrayOfInt[rowIndex][columnIndex] = sc.nextInt();
			}
		}

		for (int rowIndex = 0; rowIndex < arrayOfInt.length; rowIndex++) {
			int tempRowSum = 0;
			if ((rowIndex & 1) == 0) {
				for (int columnIndex = 0; columnIndex < arrayOfInt[rowIndex].length; columnIndex++) {
					System.out.print(arrayOfInt[rowIndex][columnIndex]+ ", ");
					tempRowSum += arrayOfInt[rowIndex][columnIndex];
				}
				System.out.println("Sum of " + rowIndex + " row is " + tempRowSum);
				sumRows += tempRowSum;
			}
		}
		System.out.println("Sum of All rows is " + sumRows);

	}

}
