package searchsort;

public class KodnestSearchSort {
	void bubbleSortAscending(int arr[]) {
		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println("the array elements after performing  the bubble  sort ascending order  are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

	void selectionSortAscending(int arr[])

	{
		for (int i = 0; i <= arr.length - 2; i++) {
			int min = arr[i];
			int pos = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;

		}
		System.out.println("the array elements after performing  the  selection sort ascending order  are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	void insertionSortAscending(int arr[])

	{
		int item;
		int j;
		for (int i = 1; i <= arr.length - 1; i++) {
			item = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;
		} 
		System.out.println("the array elements after performing  the  insertion sort ascending order  are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
	}
	}

	int linearSearch(int arr[], int key)

	{
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				System.out.print("key found"+" ");
				return i;
			}
		}

		return -1;

	}

	int binarySearch(int arr[], int key)

	{

		int low=arr[0];
		int high=arr.length-1;
		while(low<=high) {
		int mid=(low+high)/2;
		if(arr[mid]==key) {
			
			return mid;
		}
		else if(mid<key) {
			low=mid+1;
		}
		else  {			
			high=mid-1;
			low=low;
		}
	}
      return -1;
}

	

	

	void bubbleSortDescending(int arr[])

	{
		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println("the array elements after performing  the bubble sort Descending order  are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	void selectionSortDescending(int arr[])

	{

		for (int i = 0; i <= arr.length - 2; i++) {
			int max = arr[i];
			int pos = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] > max) {
					max = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;

		}
		System.out.println("the array elements after performing  the  Selecton sort descending order  are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	void insertionSortDescending(int arr[])

	{
		int item;
		int j;
		for (int i = 1; i <= arr.length - 1; i++) {
			item = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] < item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;
		}
		System.out.println("the array elements after performing  the  selection sort ascending order  are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	int findMinimum(int arr[])

	{
		int min=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}

		return min;

	}

	int findMax(int arr[])

	{
		int max=arr[0];
	for(int i=1;i<=arr.length-1;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}

		return max;

	}

}
