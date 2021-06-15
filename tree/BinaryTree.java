import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class Node{
	int key;
	Node left,right;
	Node(int key){
		this.key = key;
        left = null;
        right = null;
	}
}
public class BinaryTree{
	public Node root;
	public BinaryTree(){
		root=null;
	}
	public void insert(int key){
		if(root==null){
			root=new Node(key);
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if(temp.left==null){
            	temp.left=new Node(key);
            	break;
            }
            else{
            	q.add(temp.left);
            }
            if(temp.right==null){
            	temp.right=new Node(key);
            	break;
            }
            else{
            	q.add(temp.right);
            }
        }
	}
	public  void delete(int key){
		if(root==null){
			System.out.println("Tree is empty");
		}
		if(root.left==null&&root.right==null){
        	if (root.key == key)	
        	{
              	root=null;
              	return;
        	}
        	else{
        		System.out.println("Key Not Found");
            	return;
        	}
        }
        Queue<Node> q = new LinkedList<Node>();
    	q.add(root);
    	Node temp=null,keyNode=null;
    	while(!q.isEmpty())
    	{	
        	temp = q.peek();
        	q.remove();
         
        	if (temp.key == key)
            	keyNode = temp;
 
        	if (temp.left != null)
            	q.add(temp.left);
 
        	if (temp.right != null)
            	q.add(temp.right);
    	}
    	if(keyNode!=null){
    		int x = temp.key;
            deleteDeepest(temp);
            keyNode.key = x;
    	}
    }
    public void deleteDeepest(Node delNode){
    	Queue<Node> q = new LinkedList<Node>();
    	q.add(root);
    	Node temp=null;
    	while(!q.isEmpty()){
    		temp=q.peek();
    		q.remove();
    		if (temp == delNode)
        	{
	            temp = null;
	            return;
	             
	        }
	        if (temp.right!=null)
	        {
	            if (temp.right == delNode)
	            {
	                temp.right = null;
	                return;
	        	}
	        	else
            		q.add(temp.right);
	    	}
	    	if(temp.left!=null){
	    		if(temp.left == delNode){
	    			temp.left=null;
	    			return;
	    		}
	    		else
	    			q.add(temp.left);
	    	}
    	}
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
}