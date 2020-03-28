package problem4.main;



import problem4.binaryST.MyBinarySearchTree;

import problem4.myqueue.MyQueue;




public class MyMain {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree(myQueue);

        myBinarySearchTree.insert(2020);

        myBinarySearchTree.insert(511);

        myBinarySearchTree.insert(41);

        myBinarySearchTree.insert(6);

        myBinarySearchTree.insert(21);

        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());

        System.out.println("PreOrder successors of all the nodes");

        myQueue.show();



    }

}