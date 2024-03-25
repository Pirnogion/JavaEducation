
package lr9;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class Program7 {
    public static void main(String[] args) {
        List list = new List();

        list.addTail(1);
        list.addTail(2);
        list.addTail(3);

        System.out.println(list);
    }

    public static class List {
        public Node head;
        public Node tail;

        public int size = 0;

        public void createHeadRec(int value, int ...values) {
            addHead(value);
            if (values.length > 0) {
                createHeadRec(values[0], Arrays.copyOfRange(values, 1, values.length));
            }
        }

        public void createTailRec(int value, int ...values) {
            addTail(value);
            if (values.length > 0) {
                createTailRec(values[0], Arrays.copyOfRange(values, 1, values.length));
            }
        }

        public void toStringRec() {
            System.out.print("[");
            toStringRec(head);
            System.out.print("]");
        }

        private void toStringRec(Node current) {
            System.out.print(current.value);

            if (current.next == null) return;

            System.out.print(", ");
            toStringRec(current.next);
        }

        public void createHead(int value, int ...values) {
            addHead(value);
            for (int current: values) {
                addHead(current);
            }
        }

        public void createTail(int value, int ...values) {
            addTail(value);
            for (int current: values) {
                addTail(current);
            }
        }

        public void addHead(Integer value) {
            Node node = new Node(value);

            if (size++ == 0) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head = node;
            }
        }

        public void addTail(Integer value) {
            Node node = new Node(value);

            if (size++ == 0) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        public void insert(Integer value, int index) {
            if (index < 0 || index > size) throw new IndexOutOfBoundsException();

            if (index == 0) {
                addHead(value);
            } else if (index == size) {
                addTail(value);
            } else {
                Node node = new Node(value);

                Node previous = search(index-1);
                node.next = previous.next;
                previous.next = node;
            }
        }

        public Node removeHead() {
            Node removed = head;
            if (size == 0) {
                throw new NoSuchElementException();
            } else if (size == 1) {
                head = tail = null;
            } else {
                head = removed.next;
            }

            --size;

            return removed;
        }

        public Node removeTail() {
            Node removed = tail;
            if (size == 0) {
                throw new NoSuchElementException();
            } else if (size == 1) {
                tail = head = null;
            } else {
                tail = search(size-2);
                tail.next = null;
            }

            --size;

            return removed;
        }

        public Node remove(int index) {
            if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

            Node removed = null;
            if (size == 1 || index == 0) {
                removed = removeHead();
            } else if (index == size-1) {
                removed = removeTail();
            } else {
                Node previous = search(index-1);
                removed = previous.next;
                previous.next = (previous.next != null) ? previous.next.next : null;
            }

            return removed;
        }

        private Node search(int index) {
            int currentIndex = 0;
            Node current = head;
            while (current != null && currentIndex != index) {
                currentIndex += 1;
                current = current.next;
            }

            return current;
        }

        @Override
        public String toString() {
            StringJoiner joiner = new StringJoiner(", ", "[", "]");

            Node current = head;
            while (current != null) {
                joiner.add(Integer.toString(current.value));
                current = current.next;
            }

            return joiner.toString();
        }
    }

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("{%s -> %s}", value, (next != null) ? next.value : "null");
        }
    }
}
