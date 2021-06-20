import java.util.*;
class MinMax{
	public static BST tree= new BST();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.root=tree.insert(key, tree.root);
		}
		tree.inorder(tree.root);
		System.out.println();
		int val=max();
		System.out.println(val);
		int v=min();
		System.out.println(v);
	}
	public static int max(){
		Node temp=tree.root;
		while(temp.right!=null){
			temp=temp.right;
		}
		return temp.key;
	}
	public static int min(){
		Node temp=tree.root;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp.key;
	}
}