import java.util.*;
class Test{
	public static BST tree= new BST();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.root=tree.insert(key, tree.root);
		}
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Enter the key to delete");
		int key=sc.nextInt();
		tree.delete(key,tree.root);
		tree.inorder(tree.root);
		System.out.println();
	}
}