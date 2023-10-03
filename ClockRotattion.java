package abc;

import java.util.Scanner;

public class ClockRotattion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		int[] arr = new int[length];

		System.out.println("Enter elements of the array");
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the number of rotations:");
		int rotations = scan.nextInt();

		// Rotate the array 'rotations' times
		for (int r = 0; r < rotations; r++) {
			int lastElement = arr[arr.length - 1];

			// Shift every other element one position to the right
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}

			// Place the last element at the start of the array
			arr[0] = lastElement;
		}

		System.out.println("Rotated Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
