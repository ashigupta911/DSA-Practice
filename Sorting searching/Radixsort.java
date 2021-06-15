import java.util.*;
class Radixsort
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
		sort(arr,len);
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
	public static void sort(int a[],int l)
	{
		int max=maximum(a,l);
		for(int i=1;(max/i)>0;i=i*10)
		{
			countsort(a,l,i);
		}
	}
	public static int maximum(int ar[],int n)
	{
		int m=ar[0];
		for(int i=1;i<n;i++)
		{
			if(ar[i]>m)
			{
				m=ar[i];
			}
		}
		return m;
	}
	public static void countsort(int ar[],int n,int exp)
	{
		int[] sorted=new int[n];
		int[] count=new int[10];
		for(int j=0;j<10;j++)
		{
			count[j]=0;
		}
		for(int j=0;j<n;j++)
		{
			count[(ar[j]/exp)%10]++;
		}
		for(int i=1;i<10;i++)
		{
			count[i]+=count[i-1];
		}
		for(int i=n-1;i>=0;i--)
		{
			sorted[count[(ar[i]/exp)%10]-1]=ar[i];
			count[(ar[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++)
		{
			ar[i]=sorted[i];
		}
	}
}