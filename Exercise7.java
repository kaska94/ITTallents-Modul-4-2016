import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 6, columns = 6;

		int sumRows = 0;
		int indexRow = 0;
		int indexColumn = 0;

		int[][] arrayOfInt = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		System.out.println(arrayOfInt.length * arrayOfInt.length);
		int tempSum = 0;
		for (int index = 0; index < (arrayOfInt.length * arrayOfInt.length); index++) {
			if (((indexRow + indexColumn) % 2) == 0) {
				System.out.print(arrayOfInt[indexRow][indexColumn] + ", ");
				tempSum += arrayOfInt[indexRow][indexColumn];
			}

			indexColumn++;
			if (indexColumn == 6) {
				indexColumn = 0;
				indexRow++;
				sumRows += tempSum;
				System.out.println("sum is " + tempSum);
				tempSum = 0;
			}
		}
		System.out.println("Max Sum is " + sumRows);

	}

}
