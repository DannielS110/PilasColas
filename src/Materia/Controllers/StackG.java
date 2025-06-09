package Materia.Controllers;

import java.util.EmptyStackException;

public class StackG<T> {
    private NodeGeneric<T> top;
    private int size;

    private static class NodeGeneric<T> {
        private T value;
        private NodeGeneric<T> next;

        public NodeGeneric(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public NodeGeneric<T> getNext() {
            return next;
        }

        public void setNext(NodeGeneric<T> next) {
            this.next = next;
        }
    }

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void printStack() {
        NodeGeneric<T> aux = top;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
