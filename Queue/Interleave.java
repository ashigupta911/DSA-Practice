import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Interleave{
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			queue.add(key);
		}
		//Print();
		System.out.println("Elements of queue "+ queue);
		InterLeave(queue);
		System.out.println("Elements of queue "+ queue);
	}
	public static void InterLeave(Queue<Integer>q){
		if (q.size() % 2 != 0)
        System.out.println("Input even number of integers." );
    	Stack<Integer> s = new Stack<>();
    	int halfSize = q.size() / 2;
    	for (int i = 0; i < halfSize; i++)
    	{
        	s.push(q.peek());
        	q.remove();
        }
        while (!s.empty()) 
    	{
        	q.add(s.peek());
        	s.pop();
    	}
    	for (int i = 0; i < halfSize; i++) 
    	{
        	q.add(q.peek());
        	q.poll();
    	}
    	for (int i = 0; i < halfSize; i++)
    	{
        	s.push(q.peek());
        	q.poll();
    	}
    	while (!s.empty())
    	{
        	q.add(s.peek());
        	s.pop();
        	q.add(q.peek());
        	q.poll();
   		}
	}
}