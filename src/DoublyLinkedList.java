/**
 * Created by vadimcastro on 10/9/16.
 */


public class DoublyLinkedList {

    Node head;
    Node tail;


    public DoublyLinkedList() {
        head = null;
        tail = null;

    }


    /**
     * AlphaInsert method inserts a new node into an existing list in alphabetical order
     *
     * @param x the string to be inserted
     */

    public void AlphaInsert(String x) {

        Node test = new Node(x);

        Node current = head;


        if (current == null){
            head = test;
            tail = head;
        }

        while (current != null) {

            if (((x.compareTo(current.value) < 0) || (x.compareTo(current.value) == 0))) {
                current.next = test;
                test.prev = current;
            }

            else if (x.compareTo(current.value) > 0) {
                current.prev = test;
                test.next = current;

            }

            current = current.getNext();


        }



    }

    public Node FindNode(Node list) {
        return list;
    }

    public void TravFor(Node list) {

    }

    public void TravBack(Node list) {

    }

    public void DeleteNode(String s, Node list) {

    }

    public void Destroy(Node list) {

    }
}