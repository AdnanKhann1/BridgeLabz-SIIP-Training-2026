import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void LevelOrder(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            
            Node currentNode = q.poll();
            System.out.print(currentNode.data + " ");
            if(currentNode.left != null){
                q.offer(currentNode.left);
            }if(currentNode.right != null){
                q.offer(currentNode.right);
            }
        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        Node t2 = new Node(2);
        Node t3 = new Node(3);
        Node t4 = new Node(4);
        Node t5 = new Node(5);
        Node t6 = new Node(6);
        Node t7 = new Node(7);
        Node t8 = new Node(8);
        Node t9 = new Node(9);
        Node t10 = new Node(10);

        root.left = t2;
        root.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t4.left = t8;
        t4.right = t9;
        t5.left = t10;
        t5.right = null;
        t6.left = null;
        t6.right = null;
        t7.left = null;
        t7.right = null;
        System.out.println("Preorder Traversal:");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder Traversal:");
        inOrder(root);
        System.out.println();
        System.out.println("Postorder Traversal:");
        postOrder(root);
        System.out.println();
        System.out.println("LevelOrder Traversal:");
        LevelOrder(root);
    
    }
}
