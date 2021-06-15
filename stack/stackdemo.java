import java.util.*;
import java.io.*;
class stackdemo
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>(); 
		int i=0;
		while(i!=5)
		{
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.SEARCH");
			System.out.println("5.EXIT");
			System.out.println("Enter your choice");
			i=sc.nextInt();
			switch(i)
			{
				case 1: System.out.println("enter no");
				        int num=sc.nextInt();
				        stack.push(num);
				        break;
				case 2: int p=stack.pop();
				        System.out.println(p);
				        break;
				case 3: int s=stack.peek();
				        System.out.println("TOP ELEMENT:"+s);
				        break;
				case 4: System.out.println("enter no to search");
				        int n=sc.nextInt();
				        int y=stack.search(n);
				        if(y==-1)
				        {
				        	System.out.println("not found");
				        }
				        else
				        {
				        	System.out.println("Found at pos:"+y);
				        }
				case 5: break;
				default:System.out.println("Wrong choice");
			}
		}
	}
}