import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class RReverse{
	static Queue<Integer> queue;
	public static void main(String[] args) {
		queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			int key=sc.nextInt();
			queue.add(key);
		}
		//Print();
		System.out.println("Elements of queue "+ queue);
		queue=reversequeue(queue);
       	Print();
	}
	public static Queue<Integer> reversequeue(Queue<Integer> q){
		if(q.isEmpty()){
			return q;
		}
		int key=q.peek();
		q.remove();
		q=reversequeue(q);
		q.add(key);
		return q;
	}
	static void Print()
    {
        while (!queue.isEmpty()) 
        {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
}