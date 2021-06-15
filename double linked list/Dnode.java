class Dnode
{
	int data;
	Dnode next;
	Dnode prev;
	public Dnode()
	{
	data=0;
	next=null;
	prev=null;
	}
	public Dnode(int data)
	{
	this.data=data;
	}	
	public static void display(Dnode head)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		Dnode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	public static void reversedisplay(Dnode tail)
	{
		if(tail==null)
		{
			System.out.println("list is empty");
		}
		Dnode temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.prev;
		}
	}
	public static Dnode insert(Dnode head, Dnode tail,int num)
	{
		Dnode new1=new Dnode(num);
		if(head==null)
		{
			tail=new1;
			head=new1;
			tail.prev=null;
			tail.next=null;
			return tail;
		}

        tail.next = new1;  
        new1.prev = tail;  
        tail =new1;  
        tail.next = null;
        return tail;
	}
	public static Dnode delete(Dnode new1, Dnode head)
	{
		if(new1==null)
		{
			return head;
		}
		if(head==new1)
		{
			head=head.next;
		}
		if(new1.next!=null)
		{
			new1.next.prev=new1.prev;
		}
		if(new1.prev!=null)
		{
			new1.prev.next=new1.next;
		}
        new1=null;
        return head;
	}
}