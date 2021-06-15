import java.util.*;
class Queuearray
{
	public static Scanner sc= new Scanner(System.in);
	public static int front=-1;
    public static int rear=-1;
    public static int max=10;
	public static void main(String args[])
    {
    	int[] queue=new int[10];
    	int choice=0;
     	while(choice!=4)
     	{
     		System.out.println("1.Insert 2.Delete 3.Print 4.Exit");
     	    System.out.println("enter your choice");
     	    choice=sc.nextInt();
     	    switch(choice)
     	    {
     	    	case 1: enqueue(queue);
     	    	        break;
     	    	case 2: dequeue(queue);
     	    	        break;
     	    	case 3: display(queue);
     	    	        break;
     	    	case 4: break;
     	    	default:System.out.println("Wrong choice");
     	    }
     	}
    }
    public static void enqueue(int q[])
    {
    	System.out.println("enter item");
    	int item=sc.nextInt();
    	if((front==0&&rear==max-1)||(rear==front-1))
    	{
    		System.out.println("Queue is full");
            return;
    	}
    	if(rear==-1)
    	{
    		rear=0;
    		front=0;
    		q[rear]=item;
    	}
    	else if((rear==max-1)&&(front!=0))
    	{
    		rear=0;
    		q[rear]=item;
    	}
    	else
    	{
    		rear++;
    		q[rear]=item;
    	}
    }
    public static void dequeue(int q[])
    {
    	if(front==-1)
    	{
    		System.out.println("Queue is empty");
    		return;
    	}
        q[front]=0;

    	if(front==rear)
    	{
    		rear=-1;
    		front=-1;
    	}
    	else if(front==max-1)
    	{
    		front=0;
    	}
    	else
    	{
    		front++;
    	}
    }
    public static void display(int q[])
    {
    	if(front==-1)
    	{
            
    		System.out.println("Queue is empty");
    		return;
    	}
    	 if (rear >= front) 
        { 
        for (int i = front; i <= rear; i++) 
            System.out.print(q[i]+"  "); 
        } 
        else
        { 
        for (int i = front; i < max; i++) 
            System.out.print(q[i]+"  "); 
  
        for (int i = 0; i <= rear; i++) 
           System.out.print(q[i]+"  ");
        } 
    }
}

