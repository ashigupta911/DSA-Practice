import java.util.*;
class K_Leaves{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		int k=sc.nextInt();
		System.out.print(count(tree.root,k));
	}
	public static int count(Node ptr , int k){
		if(ptr==null){
			return 0;
		}
		if(ptr.left==null&&ptr.right==null){
			return 1;
		}
		int total= count(ptr.left,k)+count(ptr.right,k);
		if(total==k){
			System.out.println(ptr.key);
		}
		return total;
	}
}