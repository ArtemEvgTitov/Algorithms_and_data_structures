package HomeWork_Seminar_4;

public class Node<V> {
    public Node<V> parent;
    public Node<V> left;
    public Node<V> right;
    public V value;
    public Color color;

    public Node() {
    }

    public Node(V value) {
        this.parent = null;
        this.left = null;
        this.right = null;
        this.value = value;
        this.color = Color.RED;
    }

    public String toString() {
        return "Node {value = " + value +
                ", parent = " + (parent != null ? parent.value : "null") +
                ", left = " + (left != null ? left.value : "null") +
                ", right = " + (right != null ? right.value : "null") +
                ", color = " + color +
                '}';
    }
}