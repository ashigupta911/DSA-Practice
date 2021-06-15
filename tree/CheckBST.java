import java.util.*;
class CheckBST{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println(BST(tree.root,null,null));
	}
	public static boolean BST(Node temp,Node l,Node r){
		if(temp==null){
			return true;
		}
		if(l!=null&&temp.key<=l.key){
			return false;
		}
		if(r!=null&&temp.key>=r.key){
			return false;
		}
		return (BST(temp.left,l,temp)&&BST(temp.right,temp,r));
	}
}