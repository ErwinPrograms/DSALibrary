package main.datastructure;

public class Stack<T> {

    /**
     * A node that contains a single pointer
     * @param <T>
     */
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

    private Node<T> top;
    private int length;

    public Stack() {
        this.top = null;
        this.length = 0;
    }

    public T push(T data) {
        Node<T> pushedNode = new Node<>(data);
        pushedNode.setNextNode(this.top);

        this.top = pushedNode;
        this.length++;

        return data;
    }

    public T pop() {
        if(this.top == null ) {
            return null;
        }

        T poppedData = this.top.getData();

        this.top = this.top.getNextNode();
        this.length--;

        return poppedData;
    }
}
