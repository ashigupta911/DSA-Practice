import java.util.*;
class MaxMin{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.preorder(tree.root);
		System.out.println();
		System.out.println("The max element : " + max(tree.root));
		System.out.println("The min element : " + min(tree.root));
	}
	public static int max(Node node){
		if(node==null){
			return Integer.MIN_VALUE;
		}
		int res=node.key;
		int lres=max(node.left);
		int rres=max(node.right);

		return Math.max(res, Math.max(lres,rres));
	}
	public static int min(Node node){
		if(node==null){
			return Integer.MAX_VALUE;
		}
		int res=node.key;
		int lres=min(node.left);
		int rres=min(node.right);

		return Math.min(res , Math.min( rres , lres));
	}
}