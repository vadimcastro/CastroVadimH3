/**
 * Created by vadimcastro on 10/10/16.
 */


class Node {

    String value;
    Node next;
    Node prev;

    /**
     * Constructor
     */

    public Node() {
        this(null,null,null); }


    /**
     * Constructor
     * @param val new value of value
     * @param n new value of next
     * @param p new value of prev
     */

    Node(String val, Node n, Node p) {
        this.value = val;
        this.next = n;
        this.prev = p;
    }

    /**
     * Constructor
     * @param x new value of value
     */

    Node(String x) {
        this(x,null,null); }

    /**
     * getValue() method returns the value field
     * @return value field
     */

    String getValue() {
        return this.value;
    }

    /**
     * getNext() returns the next field
     * @return next field
     */

    Node getNext() {
        return this.next;
    }

    /**
     * getPrev() method returns prev field
     * @return prev field
     */

    Node getPrev() {
        return this.prev;
    }

    /**
     * setValue() sets the value of the value field
     * @param x the new value
     */

    public void setValue(String x) {
        this.value = x;
    }

    /**
     * setNext() sets the value of the next field
     * @param n the new value of next
     */

    void setNext(Node n) {
        this.next = n;
    }

    /**
     * setPrev() sets the value of the prev field
     * @param p new value of prev
     */

    void setPrev(Node p) {
        this.prev = p;
    }



}

