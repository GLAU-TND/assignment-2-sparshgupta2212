
package problem1.main;

public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.insert(87);

        bst.insert(26);

        bst.insert(49);

        bst.insert(16);

        bst.insert(19);

        bst.insert(14);

        bst.insert(10);

        bst.insert(8);

        bst.diaplay(bst.getRoot(), bst.getMlevel());

        bst.d2();

    }
}
