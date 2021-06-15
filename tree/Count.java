import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Count{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.preorder(tree.root);
		System.out.println();
		System.out.println(count());
	}
	public static int count(){
		if(tree.root==null){
			return 0;
		}
		Queue<Node> q= new LinkedList<Node>();
		q.add(tree.root);
		int count=0;
		while(!q.isEmpty()) {
			Node temp=q.poll();
			if (temp.left!=null && temp.right!=null)
            	count++;
            if (temp.left != null) 
            {
                q.add(temp.left);
            }
             if (temp.right != null) 
            {
                q.add(temp.right);
            }
		}
		return count;
	}
}
