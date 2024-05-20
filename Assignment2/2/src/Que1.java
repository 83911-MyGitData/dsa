//1. Write a insertion sort function to sort array and returns no of comparisions


public class Que1 {
	public static void InsertionSort(int arr[],int n)
	{
		int count = 0;
		for(int i =1; i<n; i++)
		{
			int j = i-1;
			int temp = arr[i];
			while(arr[j]>temp && j>=0)
			{
				count++;
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
		System.out.println("The count is :" + count);
	}
	public static void main(String[] args) {
		
		int arr[] = {12,45,84,70,50,98,50};
		InsertionSort(arr,arr.length);

	}

}
