/**
 * Created by vadimcastro on 10/10/16.
 */


public class Node {

    public String value;
    public Node next;
    public Node prev;

    public Node() {
        value = null;
        next = null;
        prev = null;

    }


    public Node(String val, Node n, Node p) {
        value = val;
        next = n;
        prev = p;
    }

    public Node(String x) {
        value = x;
        next = null;
        prev = null;
    }

    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setValue(String x) {
        value = x;
    }

    public void setNext(Node n) {
        next = n;
    }

    public void setPrev(Node p) {
        prev = p;
    }


}

