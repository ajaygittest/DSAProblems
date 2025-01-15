package dsaProblems;

public class Main {

	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(3);
		tree.insert(2);
		tree.insert(6);
		tree.insert(1);
	tree.display();
	tree.remove(3);
	}
}
