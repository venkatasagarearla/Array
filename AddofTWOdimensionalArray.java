package abc;

import java.util.Scanner;

public class AddofTWOdimensionalArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int N=scan.nextInt();
		int arr[][]=new int[N][N];
		int arr1[][]=new int[N][N];
		int arr2[][]=new int[N][N];
		System.out.println("enter the elements to the first array");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter the elements to the second array");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0; j<=arr1[i].length-1;j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<=arr1.length-1;i++)

		{

		for(int j=0;j<=arr1[i].length-1;j++)

		{

		arr2[i][j]=arr1[i][j]+arr[i][j];

		}

		}
       System.out.println();
       System.out.println("the addition of array 1 and array2 is ............");
       for(int i=0;i<=arr2.length-1;i++) {
    	   for(int j=0;j<=arr2[i].length-1;j++) {
    		 System.out.print(arr2[i][j]+" ");
    	 
       }
    	   System.out.println();
       }

	}

}
