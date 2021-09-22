import java.util.*;
class FindNth{
	public static BinaryTree tree= new BinaryTree();
	static int count=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Enter value of n : ");
		int n=sc.nextInt();
		find(tree.root,n);
	}
	public static void find(Node root, int v){
        if(root==null){
            return;
        }
        if(count<=v) {
            find(root.left, v);
            count++;
            if(count==v)
            System.out.print(root.key + " ");
            find(root.right, v);
        }
    }
}