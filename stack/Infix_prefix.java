import java.util.*;
import java.lang.*; 
class Infix_prefix
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter an expression");
		String str=sc.nextLine();
		str=convert(str);
		System.out.println(str);
	}
	public static String convert(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		StringBuilder result=new StringBuilder();
		StringBuilder exp=new StringBuilder(str);
		exp.reverse();
        char[] ch=new String(exp).toCharArray();
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]==')')
        	{
        		ch[i]='(';
        		continue;
        	}
        	if(ch[i]=='(')
        	{
        		ch[i]=')';
        		continue;
        	}
        }
        for(int i=0;i<ch.length;i++)
        {
        	char c=ch[i];
        	if (Character.isLetterOrDigit(c))
        	{
        		result.append(c);
        	}
        	else if(c=='(')
        	{
        		stack.push(c);
        	}
            else if(c==')')
            {
            	while(stack.size()>0&&stack.peek()!='(')
            	{
            		result.append(stack.pop());
            	}
            	if(stack.size()!=0&&stack.peek()!='(')
				{
					return "Invalid Expression";
				}
				else
				{
					stack.pop();
				}
            }
            else
            {
            	while(stack.size()>0&&order(c)<=order(stack.peek()))
            	{
            		if(stack.peek() == '(') 
					{
                       return "Invalid Expression"; 
                    }
                    result.append(stack.pop());
            	}
            	stack.push(c);
            }
        }
        while(stack.size()>0)
        {
        	if(stack.peek() == '(') 
            {
                return "Invalid Expression"; 
            }
            result.append(stack.pop());
        }
        result.reverse();
		return result.toString();
	}
	public static int order(char c)
	{
		switch (c) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
	}
}