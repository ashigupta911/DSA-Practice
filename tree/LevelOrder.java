import java.util.*;
class LevelOrder{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		levelorder();
	}
	public static void levelorder()
	{
	 	Queue<Node> q = new LinkedList<Node>();
	 	Node list = tree.root;
	 	q.add(list);
	 	while(!q.isEmpty()){
	 		Node temp=q.poll();
	 		System.out.print(temp.key+" ");
	 		if(temp.left!=null){
	 			q.add(temp.left);
	 		}
	 		if(temp.right!=null){
	 			q.add(temp.right);
	 		}
	 	}
	 }
}
