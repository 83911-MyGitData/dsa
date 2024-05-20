import java.util.Scanner;

public class Linear {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {88, 33, 66, 99, 11, 77, 22, 55, 14,88};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = LinearLast(arr, arr.length, key);
		//int index = LinearSecond(arr, arr.length, key);
		if(index != -1)
			System.out.println("Kay is found at index " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();

	}
	
	public static int LinearLast(int arr[],int n,int key)
		{
			for(int i=n-1;i>-1;i--)
			{
				if(arr[i] == key)
				{
					return i;
				}
			}
			return -1;
		}

	public  static int LinearSecond(int arr[],int n,int key)
	 {
		int index = -1;
		for(int i = 0 ;i<n;i++) {
			if(arr[i] == key) {
				index = i;
			}
		}
		
		return index;
		
	 }
}
