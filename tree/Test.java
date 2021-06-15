import java.util.*;
class Test{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		//tree.inorder(tree.root);
		//System.out.println();
		tree.preorder(tree.root);
		System.out.println();
		//tree.postorder(tree.root);
		//System.out.println();
		System.out.println("Enter no to deelete");
		int key=sc.nextInt();
		tree.delete(key);
		tree.preorder(tree.root);
		System.out.println();
	}
}