import java.util.*;

class LinearSearch
{
	static int search(int arr[],int n,int x)
	{
		int t=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				t=x;
			}
		}
		return t;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements in the array ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the element to be search >>  ");
		int search = sc.nextInt();
		int res = search(a,a.length,search);
		if(res==-1){
			System.out.println("Search element not found");
		}
		else{
			System.out.println("Search Element is found at position "+res);
		}
	}
}
		