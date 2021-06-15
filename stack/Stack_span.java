import java.util.*;
class Stack_span
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter no of days:");
		int n=sc.nextInt();
		int[] cost=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter cost:");
			cost[i]=sc.nextInt();
		}
		int[] span=new int[n];
		calculate(cost,n,span);
		for(int i=0;i<n;i++)
		{
			System.out.println(span[i]);
		}
	}
	public static void calculate(int c[],int n,int s[])
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		s[0]=1;
		for(int i=1;i<n;i++)
		{
			while(stack.size()>0&&c[i]>=c[stack.peek()])
			{
				stack.pop();
			}
			s[i]=(stack.empty()?(i+1):(i-stack.peek()));
			stack.push(i);
		}
	}
}