import java.util.*;
public class Merge{
	public static BinaryTree tree= new BinaryTree();
	public  static BinaryTree node= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.preorder(tree.root);
		System.out.println("");
		System.out.println("Second tree");
		for(int i=0;i<7;i++){
			int key=sc.nextInt();
				node.insert(key);
		}
		node.preorder(node.root);
		System.out.println();
		System.out.println("Mirror Tree ");
		tree.root=mirror(tree.root,node.root);
		tree.preorder(tree.root);
	}
	public static Node mirror(Node t1 , Node t2){
		if(t1==null && t2==null){
			return null;
		}
		if(t1==null){
			return t2;
		}
		if(t2==null){
			return t1;  
		}
		t1.key+=t2.key;
		t1.left=mirror(t1.left , t2.left);
		t1.right= mirror(t1.right , t2.right);
		return t1;
	}
}
