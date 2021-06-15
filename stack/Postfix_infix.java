import java.util.*;
class Postfix_infix
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
		Stack<String> stack= new Stack<String>();
		String result=new String();
		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
			if(check(c))
			{
				String s1=stack.pop();
				String s2=stack.pop();
				String temp=s2+c+s1;
				stack.push(temp);
			}
			else
			{
				stack.push(c+"");
			}
		}
		return stack.peek();
	}
	public static boolean check(char c)
	{
		switch(c)
		{
			case '+':
			case '-':
			case '*':
			case '/':
			return true;
		}
			return false;
	}
}