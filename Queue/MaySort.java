import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class MaySort{
	public static Queue<Integer> q=new LinkedList<Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int key=sc.nextInt();
			q.add(key);
		}
		//Print();
		System.out.println("Elements of queue "+ q);
		System.out.println(check(n));
	}
	public static boolean check(int n)
	{
		Stack<Integer> s = new Stack<>();
		int expected=1;
		int fnt;
		while(q.size()!=0)
		{
			fnt=q.peek();
			q.remove();
			
			if(fnt==expected)
			{
				expected++;
			}
			
			else
			{
				if(s.size()==0){
					s.push(fnt);
				}
				else if(s.size()!=0 && s.peek() < fnt){
					return false;
				}
				else{
					s.push(fnt);
				}
			}
			
			while(s.size()!=0 && s.peek()==expected)
			{
				s.pop();
				expected++;
			}

		}

		if(expected - 1 == n && s.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

