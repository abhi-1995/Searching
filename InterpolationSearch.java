import java.util.*;
class InterpolationSearch
{
	static int interpolation(int arr[],int x)
	{
		int lo=0,hi=(arr.length-1),pos;
		while(lo<=hi)
		{
			pos = lo + (hi-lo)*((x-arr[lo])/(arr[hi]-arr[lo]));
			if(x==arr[pos])
				return pos;
			else if(x<arr[pos])
				hi = pos - 1;
			else
				lo = pos + 1;
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search key ");
		int search = sc.nextInt();
		int k = interpolation(arr,search);
		if(k==-1)
			System.out.println("The search value is missing");
		else
			System.out.println("Search value is present at position "+k);
	}
}