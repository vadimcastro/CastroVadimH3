/**
 * Created by vadimcastro on 10/9/16.
 */


class DoublyLinkedList {

    Node head;
    Node tail;


    DoublyLinkedList() {
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

        if (current == null) {
            head = new Node(test.getValue());
            tail = head;


        }

        else {

            while (current != null) {

                if (test.getValue().compareTo(current.getValue()) > 0) {


                    if (current.getPrev() != null) {
                        Node n = new Node(test.getValue(), current, current.getPrev());
                        current.getPrev().setNext(n);
                        current.setPrev(n);
                    }

                    else {
                        Node n = new Node(test.getValue(), current, null);
                        current.setPrev(n);
                        head = n;
                    }





                } else if ((test.getValue().compareTo(current.getValue()) == 0 && current.getNext() != null)) {


                    if (current.getNext().getValue().compareTo(test.getValue()) < 0) {
                        Node n = new Node(test.getValue(), current.getNext(), current);
                        current.getNext().setPrev(n);
                        current.setNext(n);
                    }

                    current = current.getNext();



                } else if ((test.getValue().compareTo(current.getValue()) == 0 && current.getNext() == null)) {
                    Node n = new Node(test.getValue(), null, current);
                    current.setNext(n);
                    tail = n;
                    current = null;



                } else if ((test.getValue().compareTo(current.getValue()) < 0) && current.getNext() == null) {

                    Node n = new Node(test.getValue(), null, current);

                    current.setNext(n);
                    tail = n;
                    current = null;


                }

                else {
                    current = current.getNext();
                }





            }

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