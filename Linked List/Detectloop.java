import java.util.*;
class Detectloop
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
        addloop(head);
        detect(head,head);
     }
     public static void addloop(Node list)
     {
        System.out.println("Enter the index in which you want to add loop");
        int index_loop=sc.nextInt();
        list=head;
        int index=1;
        while(list!=null&&index<=index_loop)
        {
            if(index==index_loop)
            {
                Node new1=list;
                while(new1.link!=null)
                {
                    new1=new1.link;
                }
                new1.link=list;
                break;
            }
            list=list.link;
            index++;
        }
     }
     public static void detect(Node new1,Node list)
     {
        int check=0;
        while(new1!=null&&list!=null&&list.link!=null)
        {
             new1=new1.link;
             list=list.link.link;
             if(new1==list)
             {
                check=1;
                System.out.println("LOOP FOUND");
                Node retain=new1;
                int count=1;
                retain=retain.link;
                while(retain!=new1)
                {
                count++;
                retain=retain.link;
                }
                System.out.println("No of Nodes in loop:"+count);
                break;
             }
        }
        if(check==0)
        {
            System.out.println("LOOP NOT FOUND");
        }
     }
 }