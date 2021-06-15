import java.util.*;
class Doublylinkedlist
{
	public static Dnode head=null;
	public static Dnode tail=null;
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int i=1;
		while(i<=5)
		{
			System.out.println("enter a no");
			int num=sc.nextInt();
            insert(num);
            i++;
		}
		display();
		int choice=0;
        while(choice!=5)
        {
            System.out.println("1. Insertion at begin");
		    System.out.println("2. Insertion at middle");
		    System.out.println("3. Insertion at end");
		    System.out.println("4. Delete");
		    System.out.println("5.exit");
		    System.out.println("Enter choice");
		    choice=sc.nextInt();
        	switch(choice)
        	{
        		case 1: insertfront();
        		        break;
        		case 2: insertmid();
        		        break;
        		case 3: insertend();
        		        break;
        		case 4: delete();
        		        break;
        		case 5: break;
        		default:System.out.println("Wrong choice");
        	}
        }
        display();
	}
	public static void insert(int num)
	{
	    Dnode new1=new Dnode(num);
	    if(head==null)
	    {
	    	head = new1;  
            tail=  new1;
            head.prev = null;   
            tail.next = null;  
	    }
	    else 
	    {        
            tail.next = new1;  
            new1.prev = tail;  
            tail =new1;  
            tail.next = null;  
        }  
	}
	public static void display()
	{
		Dnode temp=head;
		if(head==null)
		{
			System.out.println("LIst is empty");
		}
        while(temp!=null)
        {
        	System.out.println(temp.data);
        	temp=temp.next;
        }
	}
	public static void insertfront()
	{
		System.out.println("enter number");
		int num=sc.nextInt();
		Dnode new1= new Dnode(num);
		new1.next=head;
		new1.prev=null;
		if(head!=null)
		{
			head.prev=new1;
		}
		head=new1;

	}
	public static void insertmid()
	{
		System.out.println("enter number");
		int num=sc.nextInt();
		Dnode new1= new Dnode(num);
		System.out.println("enter the position");
		int pos=sc.nextInt();
		Dnode list=head;
		int i=1;
		while(list!=null&&i<pos)
		{
			i++;
			list=list.next;
		}
		if(i==pos)
		{
			new1.next=list.next;
            list.next=new1;
            new1.prev=list;
            if(new1.next!=null)
            {
            	new1.next.prev=new1;
            }
		}
	}
	public static void insertend()
	{
		System.out.println("enter number");
		int num=sc.nextInt();
		Dnode new1= new Dnode(num);
		new1.prev=tail;
		tail.next=new1;
		new1.next=null;
		tail=new1;
	}
	public static void delete()
	{
		System.out.println("enter no you want to delete");
		int num=sc.nextInt();
		Dnode list=head;
		while(list!=null)
		{
			if(list.data==num)
			{
				del(list);
				break;
			}
			list=list.next;
		}
	}
	public static void del(Dnode remove)
	{
		if(head==null||remove==null)
		{
			return;
		}
		if(head==remove)
		{
			head=head.next;
		}
		if(remove.next!=null)
		{
			remove.next.prev=remove.prev;
		}
		if(remove.prev!=null)
		{
			remove.prev.next=remove.next;
		}
	}
}