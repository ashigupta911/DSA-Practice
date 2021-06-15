import java.util.*;
class Arrayplusone
{
	public static void main(String args[])
	{
       int[] a=new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.println("enter elements of array");
       int i=0;
       while(i<5)
       {
       	int num=sc.nextInt();
       	a[i]=num;
       	i++;
       }
       sc.nextLine();
       /*for(i=0;i<5;i++)
       {
       	a[i]=a[i]+1;
       	System.out.println(a[i]);
       }
       */
       plusone(a);
       i=0;
       for(int j: a)
       	System.out.println(j);
	}

      public static void plusone(int arr[])
      {
      	for(int i=0;i<5;i++)
      	{
      		arr[i]++;
      	}
      }
}