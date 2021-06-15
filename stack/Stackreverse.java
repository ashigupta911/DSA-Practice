import java.util.*;
import java.io.*;
class stackreverse
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
		reverse();
		System.out.print(stack);
	}
	public static void reverse() 
    { 
        if(stack.size() > 0) 
        { 
        	int x = stack.peek(); 
            stack.pop(); 
            reverse(); 
            insert_at_bottom(x); 
        }          
    }
    public  static void insert_at_bottom(int x) 
    { 
  
        if(stack.isEmpty()) 
            stack.push(x);
        else
        { 
        	int a = stack.peek(); 
            stack.pop(); 
            insert_at_bottom(x); 
            stack.push(a);
        }

    }
}