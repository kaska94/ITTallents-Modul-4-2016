import java.util.Scanner;

public class Bonus6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0, columns = 0;
		int[] arrayOfInts;
		int counterMax = 0;
		int rememberedNumber = 0;

		System.out.println("Enter size:");
		size = sc.nextInt();
		if ((size < 0) && (size > 50)) {
			System.out.println("Number must be between 0 and 50");
			return;
		}

		arrayOfInts = new int[size];

		for (int index = 0; index < arrayOfInts.length; index++) {
			arrayOfInts[index] = sc.nextInt();
		}

		for (int indexOutter = 0; indexOutter < arrayOfInts.length; indexOutter++) {
			int tempCounter = 0;
			for (int indexInner = 0; indexInner < arrayOfInts.length; indexInner++) {
				if (arrayOfInts[indexInner] == arrayOfInts[indexOutter]) {
					tempCounter++;
				}

				if (counterMax < tempCounter) {
					counterMax = tempCounter;
					rememberedNumber = arrayOfInts[indexOutter];
				}
			}
		}
		System.out.println("Count is " + counterMax + " last remembered number is " + rememberedNumber);

	}

}
