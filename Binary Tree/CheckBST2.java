import java.util.*;
class CheckBST2{
	public static BinaryTree tree= new BinaryTree();
	public static Node prev;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		System.out.println(isBST());
	}
	public static boolean isBST(){
		prev=null;
		return BST(tree.root);
	}
	public static boolean BST(Node temp){
		if(temp!=null){
			if(!BST(temp.left)){
				return false;
			}
			if(prev!=null&&prev.key>=temp.key){
				return false;
			}
			prev=temp;
			return BST(temp.right);
		}
		return true;
	}
}