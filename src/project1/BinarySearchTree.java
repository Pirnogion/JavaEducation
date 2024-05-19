package project1;

import java.util.*;

public class BinarySearchTree<T> implements Iterable<T> {
    private Node<T> root;
    private int size;

    public int size() {
        return size;
    }

    public T get(int key) {
        var searched = searchNode(key);
        if (searched == null) {
            throw new NoSuchElementException();
        }

        return searched.value;
    }

    public void put(int key, T value) {
        if (root != null) {
            var current = root;
            while (key != current.key) {
                if (key < current.key) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node<>(key, value, current);
                    }
                } else {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node<>(key, value, current);
                    }
                }
            }
        } else {
            root = new Node<>(key, value);
        }

        ++size;
    }

    public void delete(int deletingKey) {
        var deleting = searchNode(deletingKey);
        if (deleting == null) {
            throw new NoSuchElementException();
        }

        var parent = deleting.parent;
        if (deleting.left == null && deleting.right == null) {
            if (parent == null) {
                root = null;
            } else {
                if (deleting == parent.left) {
                    parent.left = null;
                } else if (deleting == parent.right) {
                    parent.right = null;
                }
            }
        } else if (deleting.left == null || deleting.right == null) {
            if (deleting.left != null) {
                if (parent == null) {
                    root = deleting.left;
                } else {
                    if (deleting == parent.left) {
                        parent.left = deleting.left;
                    } else if (deleting == parent.right) {
                        parent.right = deleting.left;
                    }
                }

                deleting.left.parent = parent;
            } else {
                if (parent == null) {
                    root = deleting.right;
                } else {
                    if (deleting == parent.left) {
                        parent.left = deleting.right;
                    } else if (deleting == parent.right) {
                        parent.right = deleting.right;
                    }
                }

                deleting.right.parent = parent;
            }
        } else {
            var successor = searchSuccessorNode(deletingKey);
            if (successor == null) {
                throw new NoSuchElementException();
            }

            deleting.key = successor.key;
            deleting.value = successor.value;

            if (successor.parent.left == successor) {
                successor.parent.left = successor.right;
            } else {
                successor.parent.right = successor.right;
            }

            if (successor.right != null) {
                successor.right.parent = successor.parent;
            }
        }

        --size;
    }

    @Override
    public Iterator<T> iterator() {
        return new InorderIterator<>(root);
    }

    @Override
    public String toString() {
        var joiner = new StringJoiner(" ", "[", "]");
        for (T value : this) {
            joiner.add(String.format("%s", value));
        }

        return joiner.toString();
    }

    private Node<T> searchSuccessorNode(int searchingKey) {
        Node<T> current = root, successor = null;
        while (current != null) {
            if (searchingKey < current.key) {
                successor = current;
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return successor;
    }

    private Node<T> searchNode(int searchingKey) {
        var current = root;
        while (current != null && searchingKey != current.key) {
            if (searchingKey < current.key) current = current.left;
            else current = current.right;
        }

        return current;
    }

    static class InorderIterator<U> implements Iterator<U> {
        private final Stack<Node<U>> stack;
        private Node<U> node;

        public InorderIterator(Node<U> node) {
            this.stack = new Stack<>();
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node != null || !stack.empty();
        }

        @Override
        public U next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            var temp = node;
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }

            var current = stack.pop();
            node = current.right;

            return current.value;
        }
    }

    static class Node<U> {
        private Node<U> parent, left, right;

        private int key;
        private U value;

        public Node(int key, U value, Node<U> parent) {
            this.parent = parent;
            this.key = key;
            this.value = value;
        }

        public Node(int key, U value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("Node{key: %s, value: %s}", key, value);
        }
    }
}
