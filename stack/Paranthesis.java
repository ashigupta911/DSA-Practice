import java.util.*;
import java.lang.*; 
class Paranthesis
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter an expression");
		String str=sc.nextLine();
		boolean flag =balance(str);
		if(flag==true)
			System.out.print("TRUE");
		else
			System.out.print("FALSE");
	}
	public static boolean balance(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[')
			{
				stack.push(c);
				continue;
			}
			if(stack.size()==0)
				return false;
			switch(c)
			{
				case ')':c=stack.pop();
				          if (c == '{' || c == '[') 
                          return false;
                          break; 
                case '}':c=stack.pop(); 
                if (c == '(' || c == '[') 
                    return false;
                 
                break; 
  
            case ']': 
                c=stack.pop();
                if (c == '(' || c == '{') 
                    return false; 
                break; 
			}
		}
		return(stack.empty());
	}
}