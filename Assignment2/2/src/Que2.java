import java.util.Arrays;

//2. Modify the insertion sort algorithm to sort the array in descending order
public class Que2 {
	
	public static void DescInsertion(int arr[],int n) {
		 for (int i = 1; i < arr.length; i++) {
	            int temp = arr[i];
	            int j = i;
	            while (j > 0 && arr[j - 1] < temp) {
	                arr[j] = arr[j - 1];
	                j--;
	            }
	            arr[j] = temp;
	        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,3,4,5};
		System.out.println("before sorting :" + Arrays.toString(arr));
		DescInsertion(arr,arr.length);
		System.out.println("After sorting :" + Arrays.toString(arr));
		
	}

}
