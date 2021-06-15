import java.util.*;
class Infix_postfix
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter an expression");
		String str=sc.nextLine();
		str=infix_to_postfix(str);
		System.out.println(str);
	}
	public static String infix_to_postfix(String exp)
	{
		String result=new String();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<exp.length();++i)
		{
			char c=exp.charAt(i);
			if (Character.isLetterOrDigit(c)) 
			{
                result+= c; 
			}
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				while(!stack.isEmpty()&&stack.peek()!='(')
				{
					result+=stack.pop();
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
				while(stack.size()!=0&&order(c)<=order(stack.peek()))
				{
					if(stack.peek() == '(') 
					{
                       return "Invalid Expression"; 
                    }
                    result += stack.pop(); 
			    }
				stack.push(c);
			}
		}
		while (!stack.isEmpty())
		{ 
            if(stack.peek() == '(') 
            {
                return "Invalid Expression"; 
            }
            result += stack.pop(); 
            }      
		
		return result; 
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
