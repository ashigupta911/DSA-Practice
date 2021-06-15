import java.util.*;
class Biotonicsort
{
	public static Dnode head=null;
	public static Dnode tail=null;
	public static Scanner sc=new Scanner(System.in);
	public static Dnode ob=new Dnode();
	public static Mergesort_dlist m=new Mergesort_dlist();
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
		head=sort();
		System.out.println(" ");
		ob.display(head);
	}
	public static Dnode sort()
	{
		Dnode list=head;
		while(list.next!=null)
		{
			if(list.next.data<list.data)
			{
				break;
			}
			list=list.next;
		}
		Dnode list1=head;
		Dnode list2=list.next;
		list.next=null;
		list2.prev=null;
		list2=reverse(list2);
		Dnode sorted=m.merge(list1,list2);
		return sorted;
	}
	public static Dnode reverse(Dnode list2)
	{
		Dnode list=list2;
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
			list2=temp.prev;
		}
		return list2;
	}
}