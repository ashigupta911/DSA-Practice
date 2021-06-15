import java.util.*;
class QNode {
    int key;
    QNode next;
    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}
public class Queue {
    public static QNode front, rear;
  
    public Queue()
    {
        front = rear = null;
    }
    public static void enqueue(int key)
    {
  		QNode temp = new QNode(key);
  		if (rear == null) {
            front = rear = temp;
            return;
        	}
        rear.next = temp;
        rear = temp;
    }

    public static void dequeue()
    {
    	if (front == null)
            return;
        QNode temp = front;
        front = front.next;
             if (front == null)
            rear = null;
    }
    public static void print(){
    	QNode temp=front;
    	while(temp!=null){
    		System.out.println(temp.key);
    		temp=temp.next;
    	}
    }
    public static void Cenqueue(int key)
    {
        QNode temp = new QNode(key);
        if (rear == null) {
            front = rear = temp;
            return;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
        rear.next=front;
    }
    public static void Cdequeue()
    {
        if(front==null){
            System.out.println("list is empty");
            return;
        }
        if(rear==front){
            rear = front = null;
        }
        else{
            QNode temp=front;
            front=front.next;
            rear.next=front;
            temp=null;
        }
    }
    public static void Cprint(){
        {
        if(front==null)
        {
            System.out.println("List is empty");
            return;
        }
        QNode list=front;
        while(list.next!=front)
        {
            System.out.print(list.key);
            list=list.next;
        }
        System.out.print(list.key);
        System.out.println();
    }
    }
    
}