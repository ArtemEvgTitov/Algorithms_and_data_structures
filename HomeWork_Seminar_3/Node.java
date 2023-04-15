package HomeWork_Seminar_3;

public class Node {
    int value;
    Node next;
    Node previous;

    // public Node(int value) {
    //     this.value = value;
    // }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNextAndPrevious(Node next, Node previous) {
        this.next = next;
        this.previous = previous;
    }

}
