import java.util.*;
class Sortarray
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
		sort(ar,n);
		i=0;
		System.out.println("");
		while(i<n)
		{
			System.out.print(ar[i]+" ");
			i++;
		}
	}
    public static void sort(int a[],int n)
    {
    	Stack<Integer> stack = new Stack<Integer>();
    	Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
        	stack.push(a[i]);
        }
        System.out.println("");
        System.out.print(stack);
        while(stack.size()!=0)
        {
        	int temp=stack.pop();
        	while(st.size()>0&&st.peek()>temp)
        	{
        		stack.push(st.pop());
        	}
        	st.push(temp);
        }
        System.out.println("");
         System.out.print(st);
        for(int i=0;i<n;i++)
        {
        	a[i]=st.peek();
        	st.pop();
        }
    }
}