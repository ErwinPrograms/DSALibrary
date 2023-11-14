package main.datastructure;

public class SinglyLinkedList<T> {
    private class Node<T> {
        private T data;
        private Node<T> nextNode;

        public Node(T data) {
            this.data = data;
            nextNode = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }
    }

    private Node<T> head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public SinglyLinkedList(T initialNodeData) {
        this.head = new Node<>(initialNodeData);
    }

    public T get(int index) {
        //placeholder
        return head.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
