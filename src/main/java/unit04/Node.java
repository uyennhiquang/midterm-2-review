package unit04;

public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E value, Node<E> next){
        this.value = value;
        this.next = next;
    }
    public Node(E value){
        this(value, null);
    }

    public E getValue() {
        return value;
    }
    public void setValue(E value){
        this.value = value;
    }

    public void setNext(Node<E> next ) {
        this.next = next;
    }
    public Node<E> getNext() {
        return next;
    }

    @Override
    public String toString(){
        return value + " -> " + next;  //very compact version
    }
}
