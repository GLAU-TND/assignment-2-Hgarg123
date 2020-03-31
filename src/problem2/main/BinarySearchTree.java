package problem2.main;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class BinarySearchTree {
    private TreeNode root;
    private int countRight;
    private MyQueue preQueue;
    private MyQueue postQueue;

    public void MyBinarySearchTree(MyQueue preQueue, MyQueue postQueue) {
        this.preQueue = preQueue;
        this.postQueue = postQueue;
    }

    public void insert(int data) {


    }
