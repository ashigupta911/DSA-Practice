import java.util.*;
import java.io.*;
class Stacksort1
{
	public static Stack<Integer> stack = new Stack<Integer>(); 
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int i=0;
		while(i<6)
		{
			System.out.println("enter no");
			int num=sc.nextInt();
			stack.push(num);
			i++;
		}
		System.out.print(stack);
		sort();
		System.out.print(stack);
	}
	public static void sort()
	{
		if(stack.size()>0)
		{
			int n=stack.pop();
			sort();
			insert(n);
		}
	}
	public static void insert(int x)
	{
		if(stack.size()==0||x>stack.peek())
		{
			stack.push(x);
		}
		else
		{
			int y=stack.pop();
			insert(x);
			stack.push(y);
		}
	}
}