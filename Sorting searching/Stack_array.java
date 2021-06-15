import java.util.*;
class Stack_array
{
	public static int[] stack=new int[10];
	public static int top=-1;
	public static int max=10;
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int i=0;
		while(i!=4)
		{
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PRINT");
			System.out.println("4.EXIT");
			System.out.println("Enter your choice");
			i=sc.nextInt();
			switch(i)
			{
				case 1: push();
				        break;
				case 2: pop();
				        break;
				case 3: print();
				        break;
				case 4: break;
				default:System.out.println("Wrong choice");
			}
		}
	}
	public static void push()
	{
		if(top==max-1)
		{
			System.out.println("STACK IS FULL");
			return;
		}
		else
		{
			top++;
			System.out.println("enter number");
			stack[top]=sc.nextInt();
		}
	}
	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("STACK IS EMPTY");
			return;
		}
		else
		{
			stack[top]=0;
			top--;
		}
	}
    public static void print()
    {
    	if(top==-1)
		{
			System.out.println("STACK IS EMPTY");
			return;
		}
    	for(int i=top;i>-1;i--)
    	{
    		System.out.println(stack[i]+" ");
    	}
    }
}