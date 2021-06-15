import java.util.*;
class Countnode
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
        count();
    }

    public static void count()
    {
         System.out.println("Enter the number you want to count");
         int num=sc.nextInt();
         temp=head;
         int c=0;
         while(temp!=null)
         {
            if(temp.data==num)
            {
                c++;
            }
            temp=temp.link;
         }
         System.out.println("No of times node appeared:"+c);
    } 
}     