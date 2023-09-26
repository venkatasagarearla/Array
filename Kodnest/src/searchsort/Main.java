package searchsort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements to the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();

		}
		System.out.println("The array elements are");
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.print(arr[i]+" ");
        	
        }
       
        KodnestSearchSort k=new  KodnestSearchSort();
        while(true) {
        	 System.out.println();
        	System.out.println("Enter your choice");
        	System.out.println("press 1 for------>searching");
        	System.out.println("press 2 for------>sorting");
        	System.out.println("press 3 for ------>finding the maximum and minimum element");
        	System.out.println("press any other for ------>BYEEEEEEEEEeeeee");
        	int choice=scan.nextInt();
        	switch(choice) {
        	case 1:System.out.println("press 1 for------> linear searching or Press 2 for-------> binary searching");
        	int choice1=scan.nextInt();
        	if(choice1==1) {
        		System.out.println("enter key to search");
        		int key=scan.nextInt();
        		int res=k.linearSearch(arr, key);
        		if(res>=0) {
        			System.out.println("key found at"+res);
        		}
        		else {
        			System.out.println("key not found");
        		}
        		
        	}
        	else if(choice1==2) {
        		System.out.println("enter key to search");
        		int key=scan.nextInt();
        		int res=k.binarySearch(arr, key);
        		if(res>=0) {
        			System.out.println("key found at"+res);
        		}
        		else {
        			System.out.println("key not found");
        		}
        		
        		
        	}
        	else {
        		System.out.println("go to kodNest and learn  java");
        		return;
        	}
        		break;
        	case 2:System.out.println("press 1 bubble sorting");
        	 System.out.println("press 2 for selection sorting");
        	 System.out.println("press 3 for insertion sorting");
        	 int choice2=scan.nextInt();
        	 if(choice2==1) {
        		 System.out.println("press 1 for bubble sort ascending order");
        		 System.out.println("press 2 for bubble sort decending order");
        		 int choice3=scan.nextInt();
        		 if(choice3==1) {
        			 k.bubbleSortAscending(arr);
        			  
        		 }
        		 else if(choice3==2) {
        			 k.bubbleSortDescending(arr);
        		 }
        		 else {
        			 System.out.println("go to kodnest learn java");
        			 return;
        		 }
        			 
        	 }
        	 else if(choice2==2) {
        		 System.out.println("press 1 for selection sort ascending order");
        		 System.out.println("press 2 for selection sort decending order");
        		 int choice4=scan.nextInt();
        		 if(choice4==1) {
        			 k.insertionSortAscending(arr);
        			  
        		 }
        		 else if(choice4==2) {
        			 k.insertionSortDescending(arr);
        		 }
        		 else {
        			 System.out.println("go to kodnest learn java");
        			 return;
        		 }
        		 
        	 }
        	 else if(choice2==3) {
        		 System.out.println("press 1 for inertion sort ascending order");
        		 System.out.println("press 2 for insertion sort decending order");
        		 int choice5=scan.nextInt();
        		 if(choice5==1) {
        			 k.insertionSortAscending(arr);
        			  
        		 }
        		 else if(choice5==2) {
        			 k.insertionSortDescending(arr);
        		 }
        		 else {
        			 System.out.println("go to kodnest learn java");
        			 return;
        		 }
        	 }
        		break;
        	case 3:System.out.println("press 1 for to find the maximum element");
        	System.out.println("Press 2 for to find the minimum element");
        	int choice6=scan.nextInt();
        	if(choice6==1) {
        		int max=k.findMax(arr);
        		System.out.println("the maximum element in given array is"+max);
        	}
        	else if(choice6==2) {
        		int min=k.findMinimum(arr);
        		System.out.println("the minimum element in given array is"+min);
        	}
        	else {
        		System.out.println("go to kodnest and learn java");
        		return;
        	}
        	
        	break;
        	default:System.out.println("byeeeeee:)))");  
        		
        	}
        }
	}

}
