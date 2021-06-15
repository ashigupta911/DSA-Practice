import java.util.*;
class Addlist
{
	public static Node head1;
    public static Node head2;
    public static Node head3;
	public static Scanner sc= new Scanner(System.in);
    public static Node ob =new Node();
    int l=0;

	public static void main(String args[])
    {
     	int i=1;
     	while(i<4)
     	{
     		System.out.println("Enter a no of 1st list");
    	    int num=sc.nextInt();
     		head1=ob.inserts(head1,num);
     		i++;
     	}
        i=1;
        while(i<5)
        {
            System.out.println("Enter a no of 2nd list");
            int num=sc.nextInt();
            head2=ob.inserts(head2,num);
            i++;
        }
        System.out.println("first number");
        ob.print(head1);
        System.out.println("second number");
        ob.print(head2);
        add();
        System.out.println("Sum list");
        ob.print(head3);
    }
    public static void add()
    {
        Node first=head1;
        Node second=head2;
        Node res = null; 
        Node prev = null; 
        Node temp = null; 
        int carry = 0, sum; 
        while (first != null || second != null) 
        {
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10; 
            temp = new Node(sum);
            if (res == null)
            { 
                res = temp; 
            } 
            else 
            { 
                prev.link = temp; 
            } 
            prev = temp; 
            if (first != null) 
            { 
                first = first.link; 
            } 
            if (second != null) 
            { 
                second = second.link; 
            } 
        } 
        if (carry > 0) 
        { 
            temp.link = new Node(carry); 
        } 
        head3=res;
    }
}