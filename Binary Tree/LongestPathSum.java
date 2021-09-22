import java.util.*;
class LongestPathSum{
	public static BinaryTree tree= new BinaryTree();
	static int maxlen = 0 , maxsum = 0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		tree.inorder(tree.root);
		System.out.println();
		sumpath(tree.root,1,0);
		System.out.println("Maximum length : " + maxlen);
		System.out.println("Maximum length Sum : " + maxsum);
	}
	public static void sumpath(Node node, int len, int sum){
		if(node==null){
			return;
		}
		sum+=node.key;
		if(node.left==null && node.right==null){
			if(len>maxlen){
				maxlen=len;
				maxsum=sum;
				return;
			}
			if(len==maxlen){
				if(sum>maxsum){
					maxsum=sum;
				}
				return;
			}
		}
		sumpath(node.left , len+1 , sum);
		sumpath(node.right , len+1 , sum);
	}
}