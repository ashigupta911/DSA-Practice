import java.util.*;
class Triplets_dlist
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
		triplets();
	}
	public static void triplets()
	{
		System.out.println("enter a no");
		int num=sc.nextInt();
		Dnode list=head;
        Dnode front=null;
        Dnode back=tail;
        int count=0;
        while(list!=null)
        {
        	int x=num-list.data;
        	back=tail;
        	front=list.next;
        	while(front!=null&&back.next!=front&&front!=back&&back!=null)
        	{
        		if((back.data+front.data)==x)
        		{
        			System.out.println(back.data+"  "+front.data+"  "+list.data);
        			front=front.next;
        			back=back.prev;
        			count++;
        		}
        		else if((back.data+front.data)>x)
        		{
        			back=back.prev;
        		}
        		else
        		{
        			front=front.next;
        		}
        	}
        	list=list.next;
        }
        System.out.println("Total no of pairs: "+count);
	}
}