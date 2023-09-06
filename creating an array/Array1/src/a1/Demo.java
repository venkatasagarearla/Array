package a1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("enter the length of the array");
		int a=scan.nextInt();
		String arr[]=new String[a];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the elements");
			arr[i]=scan.next();
		}
		System.out.println("the array  elements are");
		for(int i=0;i<=arr.length-1;i++) {
			
		System.out.print(arr[i]+" ");
		}
		
			
		
	}

}
