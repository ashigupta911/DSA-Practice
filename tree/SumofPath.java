//Sum of all the numbers that are formed from root to leaf paths
import java.util.*;
class SumofPath{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Sum of all paths : " + Pathsums(tree.root,0));
	}
	public static int Pathsums(Node node , int sum){
		if(node==null){
			return 0;
		}
		sum= (sum*10) + node.key;
		if(node.left==null && node.right==null){
			return sum;
		}
		return Pathsums(node.left , sum) + Pathsums(node.right , sum); 
	}
}