
package lr9;

public class Program4 {
    public static void main(String[] args) {
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node3.next = node2;
        node2.next = node1;
        node1.next = node0;

        Node ref = node3;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }

    public static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
