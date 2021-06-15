import java.util.*;
public class Test{
	public static Queue q = new Queue();
	public static void main(String[] args) {
		q.Cenqueue(10);
        q.Cenqueue(20);
        q.Cdequeue();
        q.Cdequeue();
        q.Cenqueue(30);
        q.Cenqueue(40);
        q.Cenqueue(50);
        q.Cdequeue();
        //System.out.println("Queue Front : " + q.front.key);
        //System.out.println("Queue Rear : " + q.rear.key);
        q.Cenqueue(90);
        //q.Cprint();
        System.out.println( q.rear.next.key);

	}
}