class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to insert a node at any position
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        
        newNode.next = current.next;
        current.next = newNode;
    }

    // Utility function to print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(4);

        System.out.println("Original list:");
        list.printList();

        list.insertAtPosition(3, 2); // Insert 3 at position 2
        System.out.println("List after insertion:");
        list.printList();
    }
}
