import java.util.*;
class Arithmetic
{
	public static Dnode head1,head2;
	public static Dnode tail1,tail2;
	public static Scanner sc=new Scanner(System.in);
	public static Dnode ob=new Dnode();
	public static void main(String args[])
	{
		String s1="",s2="";
		System.out.println("enter first no : ");
		s1=sc.nextLine();
		System.out.println("enter second no : ");
		s2=sc.nextLine();
		int l1=s1.length();
		int l2=s2.length();
        for(int i=0;i<l1;i++)
        {
        	tail1=ob.insert(head1,tail1,(s1.charAt(i)-'0'));
        	if(head1==null)
            {
            	head1=tail1;
            }   
        }
        for(int i=0;i<l2;i++)
        {
        	tail2=ob.insert(head2,tail2,(s2.charAt(i)-'0'));
        	if(head2==null)
            {
            	head2=tail2;
            }
        }
        System.out.println(" ");
		ob.display(head1);
		System.out.println(" ");
		ob.display(head2);	
		addition();	
		subtraction();
	}
	public static void addition()
	{
		Dnode num1=tail1;
		Dnode num2=tail2;
		int carry=0;
		int sum=0;
		Dnode add=null;
		Dnode back=null;
		while(num1!=null||num2!=null)
		{
			sum=carry+(num1 != null?num1.data:0)+(num2 != null?num2.data:0);
			carry=sum>9?1:0;
			sum=sum%10;
		    back=ob.insert(add,back,sum);
		    if(add==null)
		    {
		    	add=back;
		    }
		    if(num1!=null)
		    {
		    	num1=num1.prev;
		    }
		    if(num2!=null)
		    {
		    	num2=num2.prev;
		    }
		}
		if(carry>0)
		{
			back=ob.insert(add,back,carry);
		}
		System.out.println(" ");
		ob.reversedisplay(back);
		return;
	}
	public static void subtraction()
	{
		Dnode num1,num2;
		int size1=count(head1);
		int size2=count(head2);
		num1=size1>size2?head1:head2;
		num2=size1<size2?head1:head2;
		num2=addzero(num2,Math.abs(size1-size2));
        ob.display(num1);
        ob.display(num2);
	}
	public static int count(Dnode head)
	{
		Dnode list=head;
		int c=0;
		while(list!=head)
		{
			c++;
			list=list.next;
		}
		return c;
	}
	public static Dnode addzero(Dnode num2,int d)
	{
		if (num2 == null) 
            return null; 
        Dnode zero=new Dnode(0);
        zero.prev=null;
        d--;
        Dnode temp = zero; 
        while ((d--) != 0) 
        { 
            temp.next = new Dnode(0); 
            temp.next.prev=temp;
            temp = temp.next; 
        } 
        temp.next = num2; 
        return zero; 
	}
}