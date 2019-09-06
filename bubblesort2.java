import java.util.*;
class sorting1
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
		   for(j=0;j<arr.length-1;j++)
		   {
			   if(arr[j]>arr[j+1])
			   {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
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