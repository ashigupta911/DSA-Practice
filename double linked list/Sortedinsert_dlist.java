import java.util.*;
class Sortedinsert_dlist
{
	public static Dnode head=null;
	public static Dnode tail=null;
	public static Scanner sc=new Scanner(System.in);
	public static Dnode ob=new Dnode();
	public static void main(String args[])
	{
		int i=1;
		while(i<=5)
		{
			System.out.println("enter a no");
			int num=sc.nextInt();
            tail=ob.insert(head,tail,num);
            if(head==null)
            {
            	head=tail;
            }
            i++;
		}
		System.out.println(" ");
		ob.display(head);	
		insert();
		System.out.println(" ");
		ob.display(head);	
	}
	public static void insert()
	{
		System.out.println("enter number");
		int num=sc.nextInt();
		Dnode new1=new Dnode(num);
		if(num<=head.data)
		{
			head.prev=new1;
			new1.next=head;
			new1.prev=null;
			head=new1;
			return;
		}
		else
		{
			Dnode list=head;
			while(list.next!=null&&list.next.data<num)
			{
				list=list.next;
			}
			new1.next=list.next;
			if(list.next!=null)
			{
				list.next.prev=new1;
			}
            list.next=new1;
            new1.prev=list; 
		}
	}
}