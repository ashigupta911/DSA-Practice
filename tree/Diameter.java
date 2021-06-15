import java.util.*;
class Diameter{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("The diameter is : " + diameter(tree.root));
	}
	public static int diameter(Node temp){
		if(temp==null){
			return 0;
		}
		int lheight=height(temp.left);
		int rheight=height(temp.right);

		int ldia=diameter(temp.left);
		int rdia=diameter(temp.right);

		return Math.max(lheight+rheight+1,Math.max(ldia,rdia));
	}
	public static int height(Node temp){
		if(temp==null){
			return 0;
		}
		return 1+ Math.max(height(temp.left),height(temp.right));
	}
}