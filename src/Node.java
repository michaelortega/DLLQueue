public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> prev;

    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node(T value){
        this.value = value;
        prev = null;
        next = null;
    }
}
