import java.util.*;
class Traversal{
	public static BinaryTree tree= new BinaryTree();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			int key=sc.nextInt();
			tree.insert(key);
		}
		preorder(tree.root);
		System.out.println("");
		tree.preorder(tree.root);
		System.out.println("");
		tree.inorder(tree.root);
		System.out.println("");
		inorder();
		System.out.println("");
		tree.postorder(tree.root);
		System.out.println("");
		postorder(tree.root);
		System.out.println("");
		postorder1(tree.root);
	}
	public static void preorder(Node node){
		if(node==null){
			return;
		}
		Stack<Node> stack= new Stack<>();
		stack.push(node);
		while(stack.size()!=0){
			Node temp=stack.peek();
			System.out.print(temp.key + " ");
			stack.pop();

			if(temp.right!=null){
				stack.push(temp.right);
			}

			if(temp.left!=null){
				stack.push(temp.left);
			}
		}
	}
	public static void inorder(){
		if(tree.root==null){
			return;
		}
		Node curr= tree.root;
		Stack<Node> stack= new Stack<>();
		while(stack.size()>0 || curr!=null) {
			if(curr!=null){
				stack.push(curr);
				curr=curr.left;
			}
			else{
				curr=stack.pop();
				System.out.print(curr.key + " ");
				curr=curr.right;
			}
		}
	}
	public static void postorder(Node root){
		if(root==null)
            return;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);

            if(root.left!=null)
                st1.push(root.left);
            if(root.right!=null)
                st1.push(root.right);
        }
        while(!st2.isEmpty()){
            System.out.print(st2.pop().key + " ");
        }
	}
	public static void postorder1(Node root){
		 if(root==null)
            return;
        Node current = root;
        Stack<Node> st = new Stack<>();
        while(current!=null||!st.isEmpty()){
            if(current!=null){
                st.push(current);
                current = current.left;
            }else{
                Node temp = st.peek();
                if(temp.right!=null){
                    current = temp.right;
                }else{
                    temp = st.pop();
                    System.out.print(temp.key + " ");
                    while(!st.isEmpty()&&temp==st.peek().right){
                        temp = st.pop();
                        System.out.print(temp.key + " ");
                    }
                }
            }
        }
	}
}