package main.datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SinglyLinkedList<T> implements List<T> {
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
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    @Override
    public T get(int index) {
        if (index >= length) {
            return null;
        }

        Node<T> iteratorNode = this.head;

        for(int i = 1; i < index; i++) {
            iteratorNode = iteratorNode.getNextNode();
        }

        return iteratorNode.getData();
    }

    @Override
    public T set(int i, T t) {
        return null;
    }

    @Override
    public void add(int i, T t) {

    }

    @Override
    public T remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return null;
    }

    @Override
    public List<T> subList(int i, int i1) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] listAsArray = new Object[this.length];
        Node<T> iteratorNode = this.head;

        for(int i = 0; i < this.length; i++) {
            listAsArray[i] = iteratorNode.getData();
            iteratorNode = iteratorNode.getNextNode();
        }

        return listAsArray;
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if(this.head == null) {
            this.head = new Node<>(t);
            this.length++;
            return true;
        }

        Node<T> iteratorNode = this.head;

        while(iteratorNode.getNextNode() != null) {
            iteratorNode = iteratorNode.getNextNode();
        }

        iteratorNode.setNextNode(new Node<>(t));
        this.length++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        this.head = null;
        this.length = 0;
    }
}
