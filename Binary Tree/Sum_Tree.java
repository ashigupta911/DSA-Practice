import java.util.*;
class Sum_Tree{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Is given tree the sum tree? : "+ isSumTree(tree.root));
	}

	public static boolean isSumTree(Node node){
		if(node==null){
			return true;
		}
		if(node.left==null && node.right==null){
			return true;
		}
		int left=add(node.left);
		int right=add(node.right);

		if(node.key==left+right){
			if(isSumTree(node.left) && isSumTree(node.right)){
				return true;
			}
		}
		return false;
	}
	public static int add(Node node){
		if(node==null){
			return 0;
		}
		return add(node.left)+add(node.right)+node.key;
	}
}