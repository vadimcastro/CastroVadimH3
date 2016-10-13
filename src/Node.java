/**
 * Created by vadimcastro on 10/10/16.
 */


class Node {

    String value;
    Node next;
    Node prev;

    public Node() {
        this(null,null,null); }


    Node(String val, Node n, Node p) {
        this.value = val;
        this.next = n;
        this.prev = p;
    }

    Node(String x) {
        this(x,null,null); }

    String getValue() {
        return this.value;
    }

    Node getNext() {
        return this.next;
    }

    Node getPrev() {
        return this.prev;
    }

    public void setValue(String x) {
        this.value = x;
    }

    void setNext(Node n) {
        this.next = n;
    }

    void setPrev(Node p) {
        this.prev = p;
    }



}

