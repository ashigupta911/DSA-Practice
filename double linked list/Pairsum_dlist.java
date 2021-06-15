import java.util.*;
class Pairsum_dlist
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
		pairs();
	}
	public static void pairs()
	{
		System.out.println("enter number for pairs");
		int num=sc.nextInt();
		int sum=0;
		Dnode h=head,t=tail;
		while(h!=t&&t.next!=h&&h!=null&&t!=null)
		{
			if((t.data+h.data)==num)
			{
				System.out.println(t.data+" "+h.data);
				t=t.prev;
				h=h.next;
			}
			else if((t.data+h.data)<num)
			{
				h=h.next;
			}
			else
			{
				t=t.prev;
			}
           
		}
	}
}