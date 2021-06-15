import java.util.*;
class Identical{
	public static BinaryTree tree= new BinaryTree();
	public  static BinaryTree node= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
				tree.insert(key);
			
		}
		
		System.out.println("Second tree");
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
				node.insert(key);
		}
		tree.preorder(tree.root);
		System.out.println();
		node.preorder(node.root);
		System.out.println();
		System.out.println(" Are Trees Identical? : " + check(node.root,tree.root));
	}
	public static boolean check(Node n , Node m){
		if(n==null && m==null){
			return true;
		}
		if(n!=null && m!=null){
			return( n.key == m.key && check( n.left , m.left) && check ( n.right , m.right));
		}
		return false;
	}
}