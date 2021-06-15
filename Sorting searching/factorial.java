import java.util.*;
class FACTORIAL
{
    public static int fact(int f)
    {
    if(f==0)
    {
     return 1;
    }
    if(f<0)
    {
    return -1;
    }
    return f*fact(f-1);
    }
	public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter a no");
	  int num=sc.nextInt();
	  int ans=fact(num);
	  System.out.println(ans);
	}
}