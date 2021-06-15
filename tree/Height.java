import java.util.*;
class Height{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("The height is : " + height(tree.root));
	}
	public static int height(Node temp){
		if(temp==null){
			return 0;
		}
		return 1+Math.max(height(temp.left),height(temp.right));
	}
}