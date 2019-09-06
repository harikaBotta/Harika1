import java.util.*;
class sorting 
{
   public static void main(String arg[])
   {
	   int i,j,n,temp;
	   System.out.println("\n enter no.of elements in array: ");
	   Scanner ob= new Scanner(System.in);
	   n=ob.nextInt();
	   int arr[]=new int[n];
	   System.out.println("\n enter elements in array: ");
	   for(i=0;i<arr.length;i++)
	   {
		   arr[i]=ob.nextInt();
	   }
	   System.out.println("\n elements in array: ");
	   for(i=0;i<arr.length;i++)
	   {
		  System.out.println(arr[i]); 
	   }
	   for(i=0;i<arr.length;i++)
	   {
		   for(j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]>arr[j])
			   {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   System.out.println("\n sorting elements in array: ");
	   for(i=0;i<arr.length;i++)
	   {
		  System.out.println(arr[i]); 
	   }
   }
}