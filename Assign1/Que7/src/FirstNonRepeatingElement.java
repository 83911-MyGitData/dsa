
/*
 * 6. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
not found, return -1.

*/

public class FirstNonRepeatingElement{
	public static boolean Program(int arr[],int n,int key,int o) //o->occurence
	{
		int count = 0;
		for(int i = 0;  i<n ;i++)
		{
			if(arr[i]==key)
			{
				count++;
				if(count == o)
					return true;
			}
			
			
		}
		
		return false;
		

	}
	
public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		//boolean m = Program(arr,arr.length,2,3);
		boolean m = Program(arr,arr.length,2,2);
		
		if(m) 
			System.out.println("Element with the given occurence found");
		else
			System.out.println("Element not found");
		

	}
}


//
//public class FirstNonRepeatingElement {
//
//	public static void BubbleSort(int arr[],int n)
//	{
//		for(int i =1;i<n;i++)
//		{
//			boolean flag = false;
//			for(int j=0;j<(n-1);j++)
//			{
//				if(arr[j]>arr[j+1])
//				{
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					flag = true;
//				}
//				
//			}
//			if(!flag)
//			{
//				break;
//			}
//		}
//		
//		for(int i = 0;i<arr.length-1;i++)
//		{
//			if(arr[i]!=arr[i+1])
//			{
//				System.out.println(arr[i]);
//				break;
//			}
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
//		BubbleSort(arr,arr.length);
//		
//
//	}
//
//}
