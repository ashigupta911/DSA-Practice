import java.util.*;
class Stackmiddle
{
	public static Stack<Integer> stack = new Stack<Integer>(); 
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int i=1;
		while(i<10)
		{
			System.out.println("enter no");
			int num=sc.nextInt();
			stack.push(num);
			i++;
		}
		System.out.print(stack);
		int s=stack.size();
		remove(0,s);
		System.out.println("");
		System.out.print(stack);
	}
    public static void remove(int n,int s)
    {
    	if(n<s)
    	{
    	int x=stack.pop();
    	remove(n+1,s);
    	if(n!=s/2)
    	{
    		stack.push(x);
    	}
      }
    }
}