import java.util.*;
class Prefix_infix
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter an expression");
		String str=sc.nextLine();
		str=convert(str);
		System.out.println(str);
	}
	public static String convert(String exp)
	{
		Stack<String> stack = new Stack<>();
		for(int i=exp.length()-1;i>=0;--i)
		{
			char c=exp.charAt(i);
			if(check(c))
			{
				String s1=stack.pop();
				String s2=stack.pop();
				String temp=s1+c+s2;
                stack.push(temp);
			}
			else
			{
				stack.push(c+"");
			}
		}
		String result=stack.pop();
		return result;
	}
	public static boolean check(char c)
	{
		switch(c)
		{
			case '+': 
            case '-': 
            case '/': 
            case '*': 
            return true; 
		}
		return false;
	}
}