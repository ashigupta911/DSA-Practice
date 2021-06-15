import java.util.*;
class Sorted_duplicate_dlist
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
		Dnode list=head;
		while(list.next!=null)
		{
			if(list.data==list.next.data)
			{
				head=ob.delete(list.next,head);
			}
			else
			{
				list=list.next;
			}
		}
	}
}