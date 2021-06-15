import java.util.*;
class Selectionsort
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
	    for(int i=0;i<l-1;i++)
	    {
	    	int key=i;
	    	for(int j=i+1;j<l;j++)
	    	{
	    		if(a[j]<a[key])
	    		{
	    			key=j;
	    		}
	    	}
	    	int temp=a[i];
	    	a[i]=a[key];
	    	a[key]=temp;
	    }
    }
}