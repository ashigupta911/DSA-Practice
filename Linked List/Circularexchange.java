import java.util.*;
class Circularexchange
{
	public static Node head=null;
	public static Node temp;
	public static Scanner sc= new Scanner(System.in);
    public static Node ob =new Node();
    int l=0;

	public static void main(String args[])
    {
     	int i=1;
     	while(i<8)
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
        exchange();
        System.out.println("");
        ob.circular_print(head);
     }
     public static void exchange()
     {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node p=head;
        while(p.link.link!=head)
        {
            p=p.link;
        }
        p.link.link=head.link;
        head.link=p.link;
        p.link=head;
        head=head.link;
     }
 }