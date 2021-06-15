import java.util.*;
class Evenodd
{
	public static Node head=null;
	public static Node temp;
	public static Scanner sc= new Scanner(System.in);
    public static Node ob =new Node();
    int l=0;

	public static void main(String args[])
    {
     	int i=1;
     	while(i<6)
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
     	System.out.println("");
     	ob.print(head);
     	System.out.println("");
     	Modify();
        System.out.println("");
        ob.print(head);
    }
    public static void Modify()
    {
        Node even=null;
        Node odd=null;
        Node list=head;
        while(list!=null)
        {
            if(list.data%2==0)
            {
                Node next=list.link;
                list.link=even;
                even=list;
                list=next;
            }
            else
            {
                Node next=list.link;
                list.link=odd;
                odd=list;
                list=next;    
            }
        }
        Node new1=even;
        while(new1.link!=null)
        {
            new1=new1.link;
        }
        new1.link=odd;
        head=even;
    }
}