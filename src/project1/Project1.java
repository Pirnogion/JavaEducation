package project1;

public class Project1 {
    public static void main(String[] args) {
        var tree = new BinarySearchTree<Integer>();
//        tree.put(8, 6);
//        tree.put(3, 2);
//        tree.put(1, 1);
//        tree.put(6, 4);
//        tree.put(4, 3);
//        tree.put(7, 5);
//        tree.put(10, 7);
//        tree.put(14, 9);
//        tree.put(13, 8);

        tree.put(7, 1);
        tree.put(10, 2);
        tree.put(11, 3);
        tree.put(2, 4);
        tree.put(8, 5);

        System.out.println(tree);
    }
}
