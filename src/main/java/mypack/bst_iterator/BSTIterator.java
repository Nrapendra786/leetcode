package mypack.bst_iterator;

import java.util.Stack;


class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class BSTIterator {

    private Thread t1;
    private Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode treeNode){
        traverseLeft(treeNode);
    }

    public synchronized boolean hasNext(){
        return !stack.isEmpty();
    }

    public synchronized int next(){
        TreeNode root = stack.pop();
        traverseLeft(root.right);
        return root.val;
    }

    private void traverseLeft(TreeNode root) {
        while (root!=null) {
            stack.push(root);
            root = root.left;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left= new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(19);
        root.right.right.right = new TreeNode(20);

        BSTIterator itr = new BSTIterator(root);

        System.out.println("hasNext() -> " + itr.hasNext());
        System.out.println("next() -> " + itr.next());
        System.out.println("next() -> " + itr.next());
        System.out.println("hasNext() -> " + itr.hasNext());
        System.out.println("next() -> " + itr.next());
        System.out.println("next() -> " + itr.next());
        System.out.println("next() -> " + itr.next());
        System.out.println("next() -> " + itr.next());
        System.out.println("next() -> " + itr.next());
        System.out.println("hasNext() -> " + itr.hasNext());
    }
}
