import java.util.*;
public class Add{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		System.out.println(add(tree.root));
	}
	public static int add(Node temp){
		if(temp==null){
			return 0;
		}
		return temp.key+add(temp.left)+add(temp.right);
	}
}