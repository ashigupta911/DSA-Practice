import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Sorting{
	public static Queue<Integer> q=new LinkedList<Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int key=sc.nextInt();
			q.add(key);
		}
		System.out.println("Elements of queue "+ q);
		sort();
		System.out.println("Sorted Elements of queue "+ q);
	}
	public static void sort(){
		for(int i=1;i<=q.size();i++){
			int MinIndex=index(q.size()-i);
			addrear(MinIndex);
		}
	}
	public static int index(int sortindex){
		int MinIndex=-1;
		int value= Integer.MAX_VALUE;
		int s=q.size();
		for(int i=0;i<s;i++){
			int current=q.peek();
			q.remove();
			if(current<=value&&i<=sortindex){
				MinIndex=i;
				value=current;
			}
			q.add(current);
		}
		return MinIndex;
	}
	public static void addrear(int MinIndex){
		int value=0;
		int s=q.size();
		for(int i=0;i<s;i++){
			int current=q.peek();
			q.remove();
			if(i!=MinIndex){
				q.add(current);
			}
			else{
				value=current;
			}
		}
		q.add(value);
	}
}