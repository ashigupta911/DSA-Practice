import java.util.*;
class Countingsort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int len=sc.nextInt();
		char[] arr= new char[len];
		char[] output= new char[len];
		int i=0;
		while(i<len)
		{
			System.out.println("enter the elements");
			arr[i]=sc.next().charAt(0);
			i++;
		}
		System.out.println("array before sorting");
		print(arr);
		sort(arr,len,output);
		System.out.println("array after sorting");
		print(output);
	}
    public static void print(char a[])
	{
		int i;
        for(i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
	}
	public static void sort(char a[],int b,char ch[])
	{
       int[] count=new int[256];
       for(int i=0;i<256;++i)
       	{
       		count[i]=0;
       	}
       for(int i=0;i<b;++i)
       {
       	    ++count[a[i]];
       }
       for(int i=1;i<256;++i)
       {
       	    count[i]+=count[i-1];
       }
       for(int i=b-1;i>=0;--i)
       {
       	   ch[count[a[i]]-1]=a[i];
       	   --count[a[i]];
       }
	}
}