package Tree;

public class AVL {

	public class Node{
		private int value;
		private int height;
		
		private Node left;
		private Node right;
		
		public Node(int value){
			this.value=value;
		}
		
		public int getValue() {
			return value;
		}
	}
	
	private Node root;
	
	public AVL() {
		
	}
	
	public int height(Node node) {
		if(node==null) {
			return -1;
		}
		
		return node.height;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	
	public void display() {
		display(this.root,"Root Node: ");
	}
	
	public void inser(int value) {
		root=insert(value,root);
	}
	
	public Node insert(int value, Node node) {
		
		if(node==null) {
			node=new Node(value);
			return node;
		}
		
		if(value<node.value) {
			node.left=insert(value,node.left);
		}
		if(value>node.value) {
			node.right=insert(value,node.right);
		}
		
		node.height=Math.max(height(node.left),height(node.right))+1;
		
		return rotate(node);
	}
	
	private Node rotate(Node node) {
		
		if(height(node.left)-height(node.right)>1) {
			
			if(height(node.left.left)-height(node.left.right)>0) {
				return rightRotate(node);
			}
			if(height(node.left.left)-height(node.left.right)<0) {
				node.left=leftRotate(node.left);
				return rightRotate(node);
			}
		}
	if(height(node.left)-height(node.right)<-1) {
			
			if(height(node.right.left)-height(node.right.right)<0) {
				return leftRotate(node);
			}
			if(height(node.right.left)-height(node.right.right)>0) {
				node.left=rightRotate(node.right);
				return leftRotate(node);
			}
		}
		 
		return node;
	}
	
	
	public Node rightRotate(Node p) {
		Node c=p.left;
		Node t=c.right;
		c.right=p;
		p.left=t;
		p.height=Math.max(height(p.left), height(p.right)+1);
		c.height=Math.max(height(c.left), height(c.right)+1);
		return c;	
	}
	
	public Node leftRotate(Node c) {
		Node p=c.right;
		Node t=p.left;
	
		p.left=c;
		c.right=t;
		p.height=Math.max(height(p.left), height(p.right)+1);
		c.height=Math.max(height(c.left), height(c.right)+1);
		return p;	
	}

	public boolean balanced() {
		return balanced(root);
	}
	
	
	
	private boolean balanced(Node node) {
		if(node ==null) {
			return true;
		}
		return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left)&&balanced(node.right);
	}
	
	public void populate(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			this.inser(nums[i]);
		}
	}

	private void display(Node node, String detail) {
		if(node==null) {
			return;
		}
		
		System.out.println(detail+node.value);
		display(node.left,"Left child of "+node.value+" : ");
		display(node.right,"right child of "+node.value+" : ");
		
	}

	public static void main(String[] args) {
		BST tree=new BST();
		int[] a= {1,2,11,15,3,4,5,6,7,8,9};
		tree.populate(a);
		tree.display();
	}

}
