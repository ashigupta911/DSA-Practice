import java.util.*;
class Quicksort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int len=sc.nextInt();
		int[] arr= new int[len];
		int i=0;
		while(i<len)
		{
			System.out.println("enter the elements");
			arr[i]=sc.nextInt();
			i++;
		}
		System.out.println("array before sorting");
		print(arr);
		partition(arr,0,(len-1));
		System.out.println("array after sorting");
		print(arr);
	}
	public static void print(int a[])
	{
		int i;
        for(i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
	}
	public static void partition(int a[],int start,int end)
	{
		if(start<end)
		{
			int part=element(a,start,end);

			partition(a,start,part-1);
			partition(a,part+1,end);
		}
	}
	public static int element(int ar[],int low,int high)
	{
        int pivot=ar[high];
        int c=low-1;
        for(int i=low;i<high;i++)
        {
        	if(ar[i]<pivot)
        	{
        		c++;
        		int temp=ar[i];
        		ar[i]=ar[c];
        		ar[c]=temp;
        	}
        }
        int temp=ar[c+1];
        ar[c+1]=ar[high];
        ar[high]=temp;
        return c+1;
	}
}