import java.util.*;
class Next_great
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
        System.out.println("Enter size of array");
        int n=sc.nextInt();
		int[] ar=new int[n];
		int i=0;
		while(i<n)
		{
			System.out.println("Enter Number:");
			ar[i]=sc.nextInt();
			i++;
		}
		i=0;
		while(i<n)
		{
			System.out.print(ar[i]+" ");
			i++;
		}
		System.out.println("");
		find(ar);
	}
	public static void find(int a[])
	{
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(a[0]);
		int next,element;
		for(int i=1;i<a.length;i++)
		{
			next=a[i];
            if(stack.isEmpty()==false)
            {
            	element=stack.pop();
                while(next>element)
                {
            	    System.out.println(element + " --> " + next);
            	    if(stack.size()==0)
            		    break;
            	    element=stack.pop();
                }
                if (element > next) 
                    stack.push(element); 
		    }
		    stack.push(next);
		}
		while (stack.isEmpty() == false)  
        { 
            element = stack.pop(); 
            next = -1; 
            System.out.println(element + " -- " + next); 
        } 
	}
}