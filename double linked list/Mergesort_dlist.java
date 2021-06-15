import java.util.*;
class Mergesort_dlist
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
		Dnode node=head;	
		head=mergesort(node);
		System.out.println(" ");
		ob.display(head);
	}
    public static Dnode mergesort(Dnode head)
    {
    	if(head==null||head.next==null)
    	{
    		return head;
    	}
    	Dnode second=split(head);
    	head=mergesort(head);
    	second=mergesort(second);
    	return merge(head,second);
    }
    public static Dnode split(Dnode head)
    {
    	Dnode fast=head,slow=head;
    	while (fast.next != null && fast.next.next != null) 
    	{ 
            fast = fast.next.next; 
            slow = slow.next; 
        } 
        Dnode temp=slow.next;
        slow.next=null;
        return temp;
    }
    public static Dnode merge(Dnode first,Dnode second)
    {
    	if (first == null) 
    	{ 
            return second; 
        } 
        if (second == null) 
        { 
            return first; 
        }
        if (first.data < second.data) 
        { 
            first.next = merge(first.next, second); 
            first.next.prev = first; 
            first.prev = null; 
            return first; 
        } 
        else 
        { 
            second.next = merge(first, second.next); 
            second.next.prev = second; 
            second.prev = null; 
            return second; 
        }  
    }
}