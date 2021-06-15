import java.util.*;
class Quicksort_dlist
{
	public static Dnode head=null;
	public static Dnode tail=null;
	public static Scanner sc=new Scanner(System.in);
	public static Dnode ob=new Dnode();
	public static void main(String args[])
	{
		int i=1;
		while(i<=5)
		{
			System.out.println("enter a no");
			int num=sc.nextInt();
            tail=ob.insert(head,tail,num);
            if(head==null)
            {
            	head=tail;
            }
            i++;
		}
		System.out.println(" ");
		ob.display(head);
		quicksort(head,tail);
		System.out.println(" ");
		ob.display(head);
	}
	public static void quicksort(Dnode l,Dnode h)
	{
		if(h!=null && l!=h && l!=h.next)
		{ 
            Dnode temp = partition(l,h); 
            quicksort(l,temp.prev); 
            quicksort(temp.next,h); 
        } 
    } 
    public static Dnode partition(Dnode l,Dnode h) 
    { 
    	int x = h.data; 
    	Dnode i = l.prev; 
    	 for(Dnode j=l; j!=h; j=j.next) 
        { 
            if(j.data <= x) 
            { 
                i = (i==null) ? l : i.next; 
                int temp = i.data; 
                i.data = j.data; 
                j.data = temp; 
            } 
        } 
        i = (i==null) ? l : i.next; 
        int temp = i.data; 
        i.data = h.data; 
        h.data = temp; 
        return i; 
    }
}
