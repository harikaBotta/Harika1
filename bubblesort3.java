import java.util.*;
class sorting2
{
	static void sort(int[] arr)
	{
		int n=arr.length;
		int temp =0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String arg[])
	{
		System.out.println("enter array no.of elements: ");
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int arr[] =new int[n]; 
		System.out.println("enter array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ob.nextInt();
		}
		//int arr[]={1,3,2,7,4,5,6};
		System.out.println("Array Before Bubble sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr);
		System.out.println("Array after Bubble sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
