package a1;

import java.util.Scanner;

public class ArrayofMarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("enter the length of the array");
		int a=scan.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the elements");
			arr[i]=scan.nextInt();
		}
		System.out.println("the marks of employees are");
		for(int i=0;i<=arr.length-1;i++) {
			
		System.out.print(arr[i]+" ");
		}
		
			
		
	}

	}


