import java.util.*;
class Rotate_dlist
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
		rotate();
		System.out.println(" ");
		ob.display(head);	
	}
	public static void rotate()
	{
		System.out.println("Enter no for rotation");
		int k=sc.nextInt();
		if(k==0)
		{
			return;
		}
		int i=1;
		Dnode list=head;
        while(list!=null&&i<=k)
        {
        	list=list.next;
        	i++;
        }
        if(list==null)
        {
        	return;
        }
        list.prev.next=null;
        list.prev=null;
        tail.next=head;
        head.prev=tail;
        head=list;
	}
}