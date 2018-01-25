//Binary Search
// Input should be in the sorted order (Ascending order)
import java.util.*;
class BinarySearch
{
	int binarysearch(int arr[],int l,int r,int x)
	{
		if(r>=l)
		{
			int mid = l + (r-l)/2;
			if(arr[mid]==x)
			{
				return mid;
			}
			if(arr[mid]>x)
			{
				return binarysearch(arr,l,mid-1,x);
			}
			return binarysearch(arr,mid+1,r,x);
		}
		return -1;
	}
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		System.out.print("Enter search value : ");
		int key = sc.nextInt();
		int result = ob.binarysearch(arr,0,n-1,key);
		if(result==-1)
			System.out.println("Search element not found");
		else
			System.out.println("Element found at index "+result);
	}
}
		