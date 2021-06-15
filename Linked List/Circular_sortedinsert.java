import java.util.*;
class Circular_sortedinsert
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
        temp.link=head;
     	System.out.println("");
     	ob.circular_print(head);
        insert();
        ob.circular_print(head);
    }
    public static void insert()
    {
        System.out.println("enter no you want to insert");
        int num=sc.nextInt();
        Node new1=new Node(num);
        if(head==null)
        {
            new1.link=new1;
            head=new1;
        }
        Node list=head;
        if(new1.data<=list.data)
        {
            while(list.link!=head)
            {
                list=list.link;
            }
            list.link=new1;
            new1.link=head;
            head=new1;
        }
        else 
        {
            while(list.link!=head&&list.link.data<new1.data)
            {
                list=list.link;
            }
            new1.link=list.link;
            list.link=new1;
        }
    }
}