import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Reverse{
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
		reversequeue();
       	Print();
	}
	static void reversequeue()
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    static void Print()
    {
        while (!queue.isEmpty()) {
            System.out.print( queue.peek() + ", ");
            queue.remove();
        }
    }
}