import java.util.Scanner;

public class Bonus7c {
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


		System.out.print("\nTOP BOTTOM");
		int columnButtonTop = 0;
		int rowButtonTop = 0;
		boolean fromBottonToTop = true;
		int[][] botTopArray = new int[rows][columns];

		for (int rowIndex = 0; rowIndex < arrayOfInts.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < arrayOfInts[rowIndex].length; columnIndex++) {
				if (fromBottonToTop) {
					if (rowButtonTop < rows) {
						botTopArray[rowButtonTop][columnButtonTop] = arrayOfInts[rowIndex][columnIndex];
						rowButtonTop++;
					} else {
						if (rowButtonTop == rows) { // if no space is left on this row
							columnButtonTop++;
							rowButtonTop = rows - 1;
							botTopArray[rowButtonTop][columnButtonTop] = arrayOfInts[rowIndex][columnIndex];
							rowButtonTop--;
							fromBottonToTop = false;
						}
					}
				} else {
					if (rowButtonTop > 0) {    // from bot to top
						botTopArray[rowButtonTop][columnButtonTop] = arrayOfInts[rowIndex][columnIndex];
						rowButtonTop--;
					} else {
						if (rowButtonTop == 0) { // if no space is left on this row
							botTopArray[rowButtonTop][columnButtonTop] = arrayOfInts[rowIndex][columnIndex];
							columnButtonTop++;
							fromBottonToTop = true;
						}
					}
				}

			}
			System.out.println();
		}

		for (int rowIndex = 0; rowIndex < botTopArray.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < botTopArray[rowIndex].length; columnIndex++) {
				System.out.print(botTopArray[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}

	}
}
