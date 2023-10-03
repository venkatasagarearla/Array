package sdf;

import java.util.Scanner;

public class AntiClockRotation {
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
		 rotatearray(arr, rotations );
	}
		public static void  rotatearray(int arr[],int r) {
		for (int k= 1; k <= r; k++) {
			int temp = arr[0];		
			for (int i=0;i<arr.length-1;i++) {
				arr[i] = arr[i + 1];
			}

			arr[arr.length-1]=temp;
		}

		System.out.println("Rotated Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		}
}
