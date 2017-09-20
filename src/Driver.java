public class Driver {
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.enqueue("Mac");
        doublyLinkedList.enqueue("Mike");
        doublyLinkedList.enqueue("David");
        System.out.println("Starting list: ");
        doublyLinkedList.display();
        System.out.println();

        System.out.println("\nRemoving: "+doublyLinkedList.peek());
        doublyLinkedList.dequeue();
        System.out.print("List After Removal:  ");
        doublyLinkedList.display();
        System.out.println();

        System.out.println("\nRemoving: "+doublyLinkedList.peek());
        doublyLinkedList.dequeue();
        System.out.print("List After Removal:  ");
        doublyLinkedList.display();

    }
}
