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

                if (test.getValue().compareTo(current.getValue()) < 0) {


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

                    current = null;

                } else if ((test.getValue().compareTo(current.getValue()) == 0 && current.getNext() != null)) {


                    if (current.getNext().getValue().compareTo(test.getValue()) > 0) {
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



                } else if ((test.getValue().compareTo(current.getValue()) > 0) && current.getNext() == null) {

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


    public void FindNode(Node list) {

        Node current = head;
        boolean flag = false;

        while (current != null){

            if(list.getValue().equalsIgnoreCase(current.getValue())){
                flag = true;
                current = null;
            }

            else {
                current = current.getNext();
            }

        }

        if (flag == true){
            System.out.println("The node exists!");
        }
        else {
            System.out.println("The node does not exist!");
        }

    }

    public void TravFor() {

        Node current = head;

        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }

    }

    public void TravBack() {

        Node current = tail;

        while (current != null){
            System.out.println(current.getValue());
            current = current.getPrev();
        }

    }

    public void DeleteNode(String s, Node list) {

    }

    public void Destroy(Node list) {

    }
}