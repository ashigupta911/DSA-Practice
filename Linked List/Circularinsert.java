import java.util.*;
class Circularinsert
{
	public static Node head=null;
	public static Node temp;
	public static Scanner sc= new Scanner(System.in);
    public static Node ob =new Node();
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
        System.out.println("");
        System.out.println("1.Insert at Begining");
        System.out.println("2.Insert at Middle");
        System.out.println("3.Insert at End");
        System.out.println("4.Delete");
        System.out.println("Enter your choice");
        int c=sc.nextInt();
        System.out.println("");
        System.out.println("Enter your number");
        int num=sc.nextInt();
        switch (c)
        {
            case 1: begin(num);
                    break;
            case 2: middle(num);
                    break;
            case 3: end(num);
                    break;
            case 4: delete(num);
                    break;
            default: System.out.println("Wrong Choice");
        }
        System.out.println("");
        ob.circular_print(head);
    }
    public static void begin(int num)
    {
        Node temp=new Node(num);
        if(head==null)
        {
            temp.link=temp;
            head=temp;
            return;
        }
        Node list=head;
        while(list.link!=head)
        {
            list=list.link;
        }
        temp.link=head;
        list.link=temp;
        head=temp;
    }
    public static void end(int num)
    {
        Node temp=new Node(num);
        Node list=head;
        while(list.link!=head)
        {
            list=list.link;
        }
        list.link=temp;
        temp.link=head;
    }
    public static void middle(int num)
    {
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        Node temp=new Node(num);
        Node list=head;
        int i=1;
        while(list.link!=head)
        {
            if(i==pos)
            {
                temp.link=list.link;
                list.link=temp;
            }
            list=list.link;
            i++;
        }
    }
    public static void delete(int num)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        Node prev = new Node(); 
        while (curr.data != num) 
        { 
            if (curr.link == head)
            { 
                System.out.printf("\nGiven node is not found"+ " in the list!!!"); 
                break; 
            } 
  
            prev = curr; 
            curr = curr.link; 
        }
        if (curr.link == head) 
        { 
            head = null; 
            return; 
        }  
        if (curr == head) 
        { 
            prev = head; 
            while (prev.link != head) 
                prev = prev.link; 
            head = curr.link; 
            prev.link = head; 
        } 
        else if (curr.link == head) { 
            prev.link = head; 
        } 
        else { 
            prev.link = curr.link; 
        } 
    } 
}
