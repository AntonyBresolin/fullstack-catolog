package data_structure.tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inOrder();

        System.out.println("\n\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal:");
        tree.inOrder();

        System.out.println("\n\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal:");
        tree.inOrder();

        System.out.println("\n\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal:");
        tree.inOrder();

        System.out.println("\n\nInOrdem:");
        tree.inOrder();
        System.out.println("\nPreOrdem:");
        tree.preOrder();
        System.out.println("\nPosOrdem:");
        tree.postOrder();
    }
}
