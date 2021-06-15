import java.util.*;
class Pair_reverse_dlist
{
	public static Dnode head=null;
	public static Scanner sc=new Scanner(System.in);
	public static Dnode ob=new Dnode();
	public static void main(String args[])
	{
		int i=1;
		while(i<=10)
		{
			System.out.println("enter a no");
			int num=sc.nextInt();
			Dnode new1=new Dnode(num);
            head=push(head,new1);
            i++;
		}
		System.out.println(" ");
		ob.display(head);	
		System.out.println(" ");
		System.out.println(" Enter no for groups: ");
		int k=sc.nextInt();
		head=reverse(head,k);
		System.out.println(" ");
		ob.display(head);	
	}
    public static Dnode reverse(Dnode h, int k)
    {
    	int i=k;
    	Dnode list=h;
    	Dnode newhead=null;
    	Dnode next=null;
    	while(i>0&&list!=null)
    	{
    		next=list.next;
    		newhead = push(newhead, list); 
            list = next; 
    		i--;
    	}
    	if(list!=null)
    	{
    		h.next=reverse(next,k);
    		h.next.prev = h; 
    	}
    	return newhead;	
    }
    public static Dnode push(Dnode head,Dnode new1)
    {
    	new1.prev=null;
    	new1.next=head;
    	if(head!=null)
    	{
    	    head.prev=new1;
    	}
    	head=new1;
    	return head;
    }
}