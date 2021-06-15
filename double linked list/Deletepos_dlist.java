import java.util.*;
class Deletepos_dlist
{
	public static Dnode head=null;
	public static Dnode tail=null;
	public static Scanner sc=new Scanner(System.in);
	public static Dnode ob=new Dnode();
	public static void main(String args[])
	{
		int i=1;
		while(i<=10)
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
		remove();
		System.out.println(" ");
		ob.display(head);	
	}
	public static void remove()
	{
		if(head==null)
		{
			System.out.println("Empty list");
			return;
		}
		System.out.println("enter position");
		int pos=sc.nextInt();
		int i=1;
		Dnode list=head;
		while(i<pos&&list!=null)
		{
			i++;
			list=list.next;
		}
		if(list==null)
		{
			System.out.println("wrong position");
			return;
		}
        if(head==list)
        {
        	head=list.next;
        }
        if(list.next!=null)
        {
        	list.next.prev=list.prev;
        }
        if(list.prev!=null)
        {
        	list.prev.next=list.next;
        }
        list=null;
	}
}