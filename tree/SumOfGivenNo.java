//Root to leaf path sum equal to a given number
import java.util.*;
class SumOfGivenNo{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Enter value of sum");
		int k=sc.nextInt();
		System.out.println("Does tree has path ? : "+ haspath(tree.root , k));
	}
	public static boolean haspath(Node node , int sum){
		if (node == null)
            return sum == 0;
        return haspath(node.left, sum - node.key) || haspath(node.right, sum - node.key);
	}
}