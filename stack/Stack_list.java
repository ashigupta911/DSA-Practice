import java.util.*;
class Stack_list
{
	public static Node stack=null;
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int i=0;
		while(i!=4)
		{
			System.out.println(" ");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PRINT");
			System.out.println("4.EXIT");
			System.out.println(" ");
			System.out.println("Enter your choice");
			System.out.println(" ");
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
		reverse();
		print();
	}
	public static void push()
	{
		System.out.println(" ");
		System.out.println("enter number");
		int num=sc.nextInt();
		Node temp=new Node(num);
		if(stack==null)
		{
			stack=temp;
			stack.link=null;
			return;
		}
		temp.link=stack;
		stack=temp;  
	}
	public static void pop()
	{
		if(stack==null)
		{
			System.out.println(" ");
		    System.out.println("Stack is empty");
		    return;
		}
		else
		{
			Node temp=stack;
			stack=stack.link;
			temp=null;
		}
	}
	public static void print()
	{
		if(stack==null)
		{
			System.out.println(" ");
		    System.out.println("Stack is empty");
		    return;
		}
		else
		{
			Node temp=stack;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println(" ");
		}
	}
	public static void reverse()
	{
		Node next=null;
		Node prev=null;
		Node list=stack;
		while(list!=null)
		{
			next=list.link;
			list.link=prev;
			prev=list;
			list=next;
		}
		stack=prev;
	}
}