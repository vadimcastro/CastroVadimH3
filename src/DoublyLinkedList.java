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


    /**
     * FindNode() method searches the doubly linked list for the user input node value. If found, reports success.
     * Otherwise, reports that no such node exists.
     *
     * @param list the node to be found within the doubly linked list
     */


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

    /**
     * TravFor() method traverses the doubly linked list from the beginning and prints the value of each node in the process.
     */




    public void TravFor() {

        Node current = head;

        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }

    }

    /**
     * TravBack() method traverses the doubly linked list from the end and prints the value of each node in the process.
     */

    public void TravBack() {

        Node current = tail;

        while (current != null){
            System.out.println(current.getValue());
            current = current.getPrev();
        }

    }

    /**
     * DeleteNode() method searches for a node that matches the user input value.
     * If found, deletes the node and reports success.
     * Otherwise reports that no such node exists.
     * @param s
     */

    public void DeleteNode(String s) {

        Node current = head;

        boolean flag = false;

        while (current != null){
            if(current.getValue().equalsIgnoreCase(s)){

                Node prev = current.getPrev();
                Node nex = current.getNext();

                if(current.getPrev() == null && current.getNext() != null){
                    head = current.getNext();
                    head.setPrev(null);
                }
                else if(current.getPrev() == null && current.getNext() == null){
                    current = new Node();
                    head = current;
                }
                else if(current.getNext() == null) {
                    current.getPrev().setNext(null);
                }
                else{
                    current.getPrev().setNext(nex);
                    current.getNext().setPrev(prev);
                }

                flag = true;

                break;
            }
            else{
                current = current.getNext();
            }
        }

        if(flag == true){
            System.out.println("Node successfully deleted!");
        }

        else{
            System.out.println("Node did not exist");
        }



    }

    /**
     * Destroy() method deletes all nodes in the doubly linked list, effectively deleteing the entire list.
     */

    public void Destroy() {

        Node current = head;

        while (current != null){
            if(current.getValue().equalsIgnoreCase(current.getValue())){

                Node prev = current.getPrev();
                Node nex = current.getNext();

                if(current.getPrev() == null && current.getNext() != null){
                    head = current.getNext();
                    head.setPrev(null);
                }
                else if(current.getPrev() == null && current.getNext() == null){
                    current = new Node();
                    head = current;
                }
                else if(current.getNext() == null) {
                    current.getPrev().setNext(null);
                }
                else{
                    current.getPrev().setNext(nex);
                    current.getNext().setPrev(prev);
                }


                current = current.getNext();
            }

        }


        System.out.println("Doubly linked list successfully destroyed!");


    }

}