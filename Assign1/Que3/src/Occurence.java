import java.util.Scanner;

public class Occurence {

	public static void Binary(int arr[], int left, int right, int key) {
		int count = 0;
		while (left <= right) {
			int mid =(left+right) / 2;
			count++;
			
			if (arr[mid] == key) {
				
				System.out.println("The count is " + count + " for binary seach");
				System.out.println("The index is at" + mid);
				return;
			} else if (arr[mid] < key) {
				left = mid+1;
				
			} else {
				right  = mid-1;
				
			}
		}
		

	}

	public static void Linear(int arr[], int n, int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i] == key) {
				System.out.println("The count is " + count + " for linaer Search");
				System.out.println("Kay is found at index " + i);
			}
		}

	}

	public static void main(String[] args) {
		
int arr[] = {88, 33, 66, 99};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		 Linear(arr, arr.length, key);
		Binary(arr, 0, arr.length-1, key);
		
		sc.close();
	}

}
