class Node{
	int key;
	Node left;
	Node right;
	Node(){
		left=null;
		right=null;
	}
	Node(int key){
		this.key = key;
        left = null;
        right = null;
	}
}
public class BST{
	public Node root;
	public BST(){
		root=null;
	}
	public Node insert(int key, Node temp){
		if(temp==null){
			temp= new Node(key);
			return temp;
		}
		if(key<temp.key){
			temp.left=insert(key,temp.left);
		}
		else
		{
			temp.right=insert(key,temp.right);
		}
		return temp;
	}
	public void inorder(Node temp){
		if(temp==null)
			return;
		inorder(temp.left);
		System.out.print(temp.key+" ");
		inorder(temp.right);
	}
	public void preorder(Node temp)
	{
		if(temp==null)
			return;
		System.out.print(temp.key+" ");
		inorder(temp.left);
		inorder(temp.right);
	}
	public void postorder(Node temp)
	{
		if(temp==null)
			return;
		inorder(temp.left);
		inorder(temp.right);
		System.out.print(temp.key+" ");
	}
	public Node delete(int key , Node temp){
		if(temp==null){
			return temp;
		}
		if(key<temp.key){
			temp.left=delete(key,temp.left);
		}
		else if(key>temp.key){
			temp.right=delete(key,temp.right);
		}

		else{
			if(temp.left==null){
				return temp.right;
			}
			else if(temp.right==null){
				return temp.left;
			}

			temp.key=minvalue(temp.right);
			temp.right=delete(temp.key, temp.right);
		}
		return temp;
	}

	public int minvalue(Node node){
		int min=node.key;
		while(node.left!=null){
			min=node.left.key;
			node=node.left;
		}
		return min;
	}
}
