import java.util.Scanner;

public class Bonus7b {
	public static void main(String[] args) {
		
		/*
		 * Not done!
		 */
		
		Scanner sc = new Scanner(System.in);
		int rows = 0, columns = 0;
		int[][] arrayOfInts;
		int counter = 1;
		System.out.println("Enter rows:");
		rows = sc.nextInt();
		if ((rows < 3) || (rows >= 50)) {
			System.out.println("Number must be between 1 and 50");
			return;
		}

		System.out.println("Enter columns:");
		columns = sc.nextInt();
		if ((rows < 3) || (rows > 50)) {
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

		int[][] diagonalArray = new int[rows][columns];
		int rowDiagonal = 0, columnDiagonal = 0;
		int maxRowIndexInDiagonalArray = 0;
		

		for (int rowIndex = 0; rowIndex < arrayOfInts.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInts[rowIndex].length; columnIndex++) {

				if ((rowDiagonal == columnDiagonal) && (rowDiagonal == 0)) { // [0][0]
					diagonalArray[rowDiagonal][columnDiagonal] = arrayOfInts[rowIndex][columnIndex];
					maxRowIndexInDiagonalArray++;
					rowDiagonal++;
				} else {
					if (rowDiagonal == 0) { // refreshing point left
						if ((maxRowIndexInDiagonalArray + 1) != rows) {
							diagonalArray[rowDiagonal][columnDiagonal] = arrayOfInts[rowIndex][columnIndex];
							maxRowIndexInDiagonalArray++;
							rowDiagonal = maxRowIndexInDiagonalArray;
							columnDiagonal = 0;
						} else { // refresh but do not increment
							diagonalArray[rowDiagonal][columnDiagonal] = arrayOfInts[rowIndex][columnIndex];
							rowDiagonal = maxRowIndexInDiagonalArray;
							columnDiagonal = columnDiagonal - maxRowIndexInDiagonalArray + 1;
						}
					} else { // Up -left action
						if ((columnDiagonal + 1) != columns) {
							diagonalArray[rowDiagonal][columnDiagonal] = arrayOfInts[rowIndex][columnIndex];
							rowDiagonal--;
							columnDiagonal++;

						} else {
							diagonalArray[rowDiagonal][columnDiagonal] = arrayOfInts[rowIndex][columnIndex];
							rowDiagonal = rows-1;
							columnDiagonal = columnDiagonal - maxRowIndexInDiagonalArray;
							maxRowIndexInDiagonalArray--;
						}
					}
				}
			}
			System.out.println();
		}

		for (int rowIndex = 0; rowIndex < arrayOfInts.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInts[rowIndex].length; columnIndex++) {
				System.out.print(diagonalArray[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}
	}
}
