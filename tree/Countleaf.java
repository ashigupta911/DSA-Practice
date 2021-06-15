import java.util.*;
public class Countleaf{
	public static BinaryTree tree= new BinaryTree();
	static int y=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.preorder(tree.root);
		System.out.println();
		count(tree.root);
		System.out.println("No of nodes :"+ y);
	}
	public static void count(Node temp){
		if(temp==null){
			return;
		}
		if(temp.left==null&&temp.right==null){
			y++;
			return;
		}
		count(temp.left);
		count(temp.right);
	}
}