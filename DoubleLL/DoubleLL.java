class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoubleLL {
    Node head;

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // Print DLL from head
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.printList(); // Output: 30 <-> 20 <-> 10 <-> null
    }
}
