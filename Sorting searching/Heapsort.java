import java.util.*;
class Heapsort
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
		for(int i=(l/2)-1;i>=0;i--)
		{
			heapify(a,l,i);
		}
		for(int i=l-1;i>0;i--)
		{
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a,i,0);
		}
	}
	public static void heapify(int ar[],int n,int j)
	{
		int largest=j;
		int l=(j*2)+1;
		int r=(j*2)+2;
		if(l<n&&ar[l]>ar[largest])
		{
			largest=l;
		}
		if(r<n&&ar[r]>ar[largest])
		{
			largest=r;
		}
		if(largest!=j)
		{
			int swap=ar[largest];
			ar[largest]=ar[j];
			ar[j]=swap;
			heapify(ar,n,largest);
		}
	}
}