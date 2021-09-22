import java.util.*;
class Mirror{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		tree.root=mirror(tree.root);
		tree.inorder(tree.root);
	}
	public static Node  mirror(Node temp){
		if(temp==null){
			return temp;
		}
		Node left=mirror(temp.left);
		Node right=mirror(temp.right);

		temp.left=right;
		temp.right=left;

		return temp;
	}
}