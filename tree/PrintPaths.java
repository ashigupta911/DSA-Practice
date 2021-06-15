import java.util.*;
class PrintPaths{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.preorder(tree.root);
		System.out.println();
		print();
	}
	public static void print(){
		int path[] = new int[1000];
		paths(tree.root,path,0);
	}
	public static void paths(Node node,int[] path , int len){
		if(node==null){
			return;
		}
		path[len]=node.key;
		len++;
		if(node.left==null && node.right==null){
			printArray(path,len);
		}
		else{
			paths(node.left,path,len);
			paths(node.right,path,len);
		}
	}
	public static void printArray(int[] path,int len){
		for(int i=0;i<len;i++){
			System.out.print(path[i]+ " ");
		}
		System.out.println();
	}
}
