import java.util.Scanner;

public class ReverseBinary {

	public static int ReverseBinarySearch(int arr[],int n,int key) {
		
		int left = 0;
		int right = (n-1);
		
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid]>key)
			{
				left = mid +1;
			}
			else
			{
				right = mid-1;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		int arr[] = {99,88,77,66,55,44,33,22,11};
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = ReverseBinarySearch(arr,arr.length-1,key);
		if(index==-1)
			System.out.println("no such number");
		System.out.println("index  == "+ index);
	}
}
