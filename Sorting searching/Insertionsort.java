import java.util.*;
class Insertionsort
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
		sort(arr);
		System.out.println("array after sorting");
		print(arr);
	}
	public static void sort(int a[])
	{
		int i,j,key;
		for(i=1;i<a.length;i++)
		{
           key=a[i];
           j = i - 1; 
           while (j >= 0 && a[j] > key)
            { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        } 
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
}