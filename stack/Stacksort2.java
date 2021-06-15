import java.util.*;
class Stacksort2
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
		Stack<Integer> st = new Stack<Integer>();
		while(stack.size()!=0)
		{
			int temp=stack.pop();
			while(!st.isEmpty()&&st.peek()>temp)
			{
				stack.push(st.pop());
			}
			st.push(temp);
		}
		stack=st;
	}
}