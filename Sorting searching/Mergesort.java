import java.util.*;
class Mergesort
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
		divide(arr,0,(len-1));
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
	public static void divide(int a[], int start, int end)
	{
		if(start<end)
		{
			int middle=(end+start)/2;
			divide(a,start,middle);
			divide(a,(middle+1),end);
			merge(a,start,middle,end);
		}
	}
	public static void merge(int ar[],int s,int m,int e)
	{
		int len1=m-s+1;
		int len2=e-m;
		int[] a1=new int[len1];
		int[] a2=new int[len2];
		for(int i=0;i<len1;i++)
		{
			a1[i]=ar[s+i];
		}
		for(int j=0;j<len2;j++)
		{
			a2[j]=ar[m+1+j];
		}
		int i=0;
		int k=s;
		int j=0;
		while(i<len1&&j<len2)
		{
			if(a1[i]<=a2[j])
			{
				ar[k]=a1[i];
				i++;
			} 
			else
			{
				ar[k]=a2[j];
				j++;
			}
			k++;
		}
		while(i<len1)
		{
			ar[k]=a1[i];
			i++;
            k++;
		}
		while(j<len2)
		{
			ar[k]=a2[j];
			j++;
			k++;
		}
	}
}