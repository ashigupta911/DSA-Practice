import java.util.*;
class Circularlist 
{
	public static Node head=null;
	public static Node temp;
    public static Node head1,head2;
	public static Scanner sc= new Scanner(System.in);
    public static Node ob =new Node();
    int l=0;

	public static void main(String args[])
    {
     	int i=1;
     	while(i<4)
     	{
     		System.out.println("Enter a no");
    	    int num=sc.nextInt();
     		temp=ob.insert(head,temp,num);
     		if(head==null)
     		{
     			head=temp;
     		}
     		i++;
     	}
        temp.link=head;
     	System.out.println("");
     	ob.circular_print(head);
        split();
        System.out.println("");
        ob.circular_print(head1);
        System.out.println("");
        ob.circular_print(head2);
    }
    public static void split() // spliting a circular list
    {
        Node slow=head;
        Node fast=head;
        while(fast.link!=head&&fast.link.link!=head)
        {
            fast=fast.link.link;
            slow=slow.link;
        }
        System.out.println("");
        System.out.println("Middle Node is"+" "+slow.data);
        if (fast.link.link == head) 
        { 
            fast = fast.link; 
        } 
        head1=head; 
        head2 = slow.link; 
        fast.link = slow.link; 
        slow.link = head;
    } 
}