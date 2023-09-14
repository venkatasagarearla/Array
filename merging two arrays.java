package com.level2;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of the array");
	int n=scan.nextInt();
	int arr1[]=new int[n];
	int arr2[]=new int[n];
	System.out.println("enter the elements to first araay");
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	System.out.println("enter the elements to second array");
	for(int i=0;i<=arr2.length-1;i++) {
		arr2[i]=scan.nextInt();
	}
	int arr3[]=new int[arr2.length+arr1.length];
	int j=0;
	for(int i=0;i<=arr1.length-1;i++) {
		arr3[j]=arr1[i];
		j++;
	}
	for(int i=0;i<=arr1.length-1;i++) {
		arr3[j]=arr2[i];
		j++;
	}
	System.out.print("the merged array is---->");
	for(int i=0;i<=arr3.length-1;i++) {
		System.out.print(arr3[i]+" ");
	}
	
	
	

}
}
