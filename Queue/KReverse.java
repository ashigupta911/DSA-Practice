import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class KReverse{
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
		int k=sc.nextInt();
		Kreverse(k);
       	Print();
	}
	public static void Kreverse(int k){
		if (queue.isEmpty() == true || k > queue.size())
            return;
        if (k <= 0)
            return;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
	}
	public static void Print()
    {
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
}