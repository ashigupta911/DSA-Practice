import java.util.*;
class Circularevendelete
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
        temp.link=head;
     	System.out.println("");
     	ob.circular_print(head);
        removeeven();
        System.out.println("");
        ob.circular_print(head);
    }
    public static void removeeven()
    {
        Node ptr=head;
        Node next=null;
        do
        {
            if(digitsum(ptr.data))
            {
                delete(ptr);
            }
            ptr=ptr.link;
        } while(ptr.link!=head);
    }
    public static boolean digitsum(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=(num%10);
            num/=10;
        }
        return (sum%2==0?true:false);
    }
    public static void delete(Node del)
    {
        Node temp=head;
        if(head==del)
        {
            while(temp.link!=head)
            {
                temp=temp.link;
            }
             head=head.link;
             temp.link=head;
             return;
        }
        Node prev=new Node();
        while(temp!=del)
        {
            prev=temp;
            temp=temp.link;
        }
        prev.link=del.link;
        del=null;
    }
}
