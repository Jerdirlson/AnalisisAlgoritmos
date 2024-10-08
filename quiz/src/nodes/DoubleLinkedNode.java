package nodes;


public class DoubleLinkedNode<T> extends Node<T> {

    DoubleLinkedNode<T> next;
    DoubleLinkedNode<T> previous;

    public DoubleLinkedNode() {
        super();
        this.next = null;
        this.previous = null;
    }

    public DoubleLinkedNode(T object) {
        super(object);
        this.next = null;
        this.previous = null;
    }

    public DoubleLinkedNode(T object, DoubleLinkedNode<T> next, DoubleLinkedNode<T> previous) {
        super(object);
        this.next = next;
        this.previous = previous;
    }

    public DoubleLinkedNode<T> getNext() {
        return next;
    }

    public DoubleLinkedNode<T> getPrevious() {
        return previous;
    }

    public void setNext(DoubleLinkedNode<T> next) {
        this.next = next;
    }

    public void setPrevious(DoubleLinkedNode<T> previous) {
        this.previous = previous;
    }
    
}
