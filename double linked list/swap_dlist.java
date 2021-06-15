import java.util.*;
class swap_dlist
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
		swap();
		System.out.println(" ");
		ob.display(head);	
	}
	public static void swap()
	{
		int count=countnodes();
		System.out.println("enter the index to swap");
		int index=sc.nextInt();
		if(index>count)
		{
			System.out.println("Not possible");
			return;
		}
		if(2*index-1==count)
		{
			return;
		}
		Dnode h=head;
		Dnode t=tail;
		Dnode hp=null,tp=t.prev;
		for (int i = 1; i < index; i++) 
        { 
        	hp=h;
            t  = t.prev;
            h  = h.next; 
            tp=t.prev;
        }
        if(hp!=null)
        {
        	hp.next=t;
        } 
        if(tp!=null)
        {
        	tp.next=h;
        }
        Dnode temp = h.next; 
        h.next = t.next; 
        t.next = temp; 
        if (index == 1) 
            head = t; 
  
        if (index == count) 
            head = h; 

	}
	public static int countnodes()
	{
		Dnode list=head;
		int c=0;
		while(list!=null)
		{
			c++;
			list=list.next;
		}
		return c;
	}
}