import java.util.*;
class Insert_dlist
{
	public static Dnode head=null;
	public static Dnode tail=null;
	public static Scanner sc=new Scanner(System.in);
	public static Dnode ob=new Dnode();
	public static void main(String args[])
	{
		int i =1;
		while(i==1)
		{
			System.out.println("Enter no to insert: ");
			int num=sc.nextInt();
			insert(num);
			System.out.println("Press 1 to continue:");
			i=sc.nextInt();
		}
		System.out.println(" ");
		ob.display(head);	
		count();
	}
	public static void insert(int num)
	{
		Dnode new1=new Dnode(num);
		if(head==null)
		{
			head=new1;
			tail=new1;
			head.prev=null;
			tail.next=null;
			return;
		}
		else if(num<=head.data)
		{
			new1.prev=null;
			new1.next=head;
			head.prev=new1;
			head=new1;
			return;
		}
		else if(num>=tail.data)
		{
			tail.next=new1;
			new1.prev=tail;
			new1.next=null;
			tail=new1;
			return;
		}
		Dnode list=head.next;
		while(list.next.data<num&&list.next!=null)
		{
			list=list.next;
		}
		new1.next=list.next;
		list.next.prev=new1;
		list.next=new1;
		new1.prev=list;
        
	}
    public static void count()
    {
    	Dnode list=tail;
    	int c=0;
    	while(list!=null)
    	{
    		c++;
            list=list.prev;
    	}
    	System.out.println("Total No of Nodes : "+c);
    }
}