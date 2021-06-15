import java.util.*;
class Reverse_dlist
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
		reverse();
		System.out.println(" ");
		ob.display(head);
	}
	public static void reverse()
	{
		Dnode list=head;
		Dnode temp=null;
		while(list!=null)
		{
			temp=list.prev;
			list.prev=list.next;
			list.next=temp;
			list=list.prev;
		}
		if(temp!=null)
		{
			head=temp.prev;
		}
	}
}