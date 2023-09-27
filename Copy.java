package abc;

import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[][]=new int[N][N];
		int arr1[][]=new int[N][N];
		for(int i=0;i<=N-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("The array elements in array 1");
		  for(int i=0;i<=N-1;i++) {
	    	   for(int j=0;j<=arr[i].length-1;j++) {
	    		 System.out.print(arr[i][j]+" ");
	    	   }
	       }
		
       for(int i=0;i<=N-1;i++) {
    	   for(int j=0;j<=arr[i].length-1;j++) {
    		   arr1[i][j]=arr[i][j];
    	   }
       }
       System.out.println();
       System.out.println("the array elements in array 2....");
       for(int i=0;i<=N-1;i++) {
    	   for(int j=0;j<=arr1[i].length-1;j++) {
    		 System.out.print(arr[i][j]+" ");
    	 
       }
    	   System.out.println();
       }
	}

}
