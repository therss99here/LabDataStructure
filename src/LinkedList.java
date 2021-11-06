public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insertAtHead(int data){
        if(head == null){
            Node node = new Node(data);
            node.next = head;
            head = node;
        }
    }

    public void insertAtTail(int data){
        Node node = new Node(data);
        if(head == null){
            head = new Node(data);
            return;
        }
        node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        return;
    }
}
