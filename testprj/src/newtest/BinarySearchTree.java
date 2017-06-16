package newtest;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
    	
    	if(root==null)
    		return false;
    	
    	if(value==root.value)
    		return true;
    	
    	else if(value>root.value)
    		return contains(root.right,value);
    	
    	else
    		return contains(root.left,value);
    }
    
    public static void main(String[] args) {
		
    	Node n1 = new Node(1,null,null);
    	Node n2 = new Node(2, n1, null);
        Node n4 = new Node(4,null,null);
		Node n3 = new Node(3, n2, n4);
		Node n6 = new Node(6,null,null);
		Node n8 = new Node(8,null,null);
		Node n7 = new Node(7, n6, n8);
		Node n5 = new Node(5, n3, n7 );
        
        System.out.println(contains(n5, 9));
    }     
}