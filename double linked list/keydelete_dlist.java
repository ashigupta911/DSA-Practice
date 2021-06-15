import java.util.*;
class Keydelete_dlist
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
		System.out.println("Enter no to delete: ");
		int num=sc.nextInt();
		Dnode list=head;
		while(list!=null)
		{
			if(list.data==num)
			{
				Dnode new1=list;
				if(new1==null)
				{
					return;
				}
				if(head==new1)
				{
					head=head.next;
				}
				if(new1.next!=null)
				{
					new1.next.prev=new1.prev;
				}
				if(new1.prev!=null)
				{
					new1.prev.next=new1.next;
				}
                new1=null;
			}
			list=list.next;
		}
	}
}