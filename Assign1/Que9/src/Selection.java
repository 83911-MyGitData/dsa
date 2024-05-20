import java.util.Arrays;

public class Selection {

	public static int SelectionSort(int arr[],int n)
	{
		int count = 0;
		for(int i=0;i<n-1;i++)
		{
			for(int j = i+1; j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					count++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {14,22,2,5,10,18,55};
		System.out.println("Before Swapping :" + Arrays.toString(arr));
		int count = SelectionSort(arr,arr.length);
		System.out.println("Before Swapping :" + Arrays.toString(arr));
		System.out.println("The count is : "+ count);
		
	}

}
