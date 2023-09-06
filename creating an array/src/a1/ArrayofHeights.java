package a1;

import java.util.Scanner;

public class ArrayofHeights {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("enter the length of the array");
		int a=scan.nextInt();
		float arr[]=new float[a];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the  heights of the palyers");
			arr[i]=scan.nextFloat();
		}
		System.out.println("the height of employees are");
		for(int i=0;i<=arr.length-1;i++) {
			
		System.out.print(arr[i]+" ");
		}
		
			
		
	}


	}



