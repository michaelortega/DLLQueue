
public class DoublyLinkedList<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void enqueue(T value) {
        @SuppressWarnings("unchecked")
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setPrev(tail);
           tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        } else {
            Node<T> nodeToRemove = head;
            if (head.getNext() == null) {
                tail = null;
            }
            head = head.getNext();
            size--;
            return nodeToRemove.getValue();
        }
    }

    @Override
    public T peek() {
        return head.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return head == null;
    }

    //for testing
    public void display(){
        Node cursor = head;
        while (cursor != null){
            System.out.print(cursor.getValue() + " ");
            cursor = cursor.getNext();
        }
    }

}
