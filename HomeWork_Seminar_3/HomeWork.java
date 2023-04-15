package HomeWork_Seminar_3;

public class HomeWork {
    static Node head;
    static Node tail;

    public static void main(String[] args) {

        Node n1 = add(5);
        Node n2 = add(6);
        Node n3 = add(9);
        
        printAll(n1);
        revert();
        printAll(n3);
    }

    static void printAll(Node n) {
        if (n.getNext() != null) {
            System.out.print(n.getValue() + " ");
            printAll(n.next);
        } else {
            System.out.print(n.getValue());
        }
    }

    public static Node add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        return node;
    }

    public static void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }
}