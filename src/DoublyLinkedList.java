/**
 * Created by vadimcastro on 10/9/16.
 */
public class DoublyLinkedList {

    Node head;
    Node tail;


    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;

    }



    public boolean isEmpty(){
        return head == null;
    }






    public class Node {

        private String value;
        private Node next;
        private Node prev;

        public Node(String val, Node n, Node p){
            this.value = val;
            this.next = n;
            this.prev = p;
        }

        public Node(String x){
            this.value = x;
        }

        public String getValue(){
            return this.value;
        }

        public Node getNext(){
            return this.next;
        }

        public Node getPrev(){
            return this.prev;
        }

        public void setValue(String x){
            this.value = x;
        }

        public void setNext(Node n){
            this.next = n;
        }

        public void setPrev(Node p){
            this.prev = p;
        }


    }

    /**
     * AlphaInsert method inserts a new node into an existing list in alphabetical order
     * @param list the list for the node to be inserted into
     */

    public void AlphaInsert(Node list){

        Node current = head;

        while (current != null){

            if ((list.value.compareTo(current.value) > 0) || (list.value.compareTo(current.value) == 0)){
                current.next = list;
                list.prev = current;
            }

            else if (list.value.compareTo(current.value) < 0){
                current.prev = list;
                list.next = current;
            }

            current = current.next;
        }
    }

    public Node FindNode(Node list) {
        return list;
    }

    public void TravFor(Node list){

    }

    public void TravBack(Node list){

    }

    public void DeleteNode(String s, Node list){

    }

    public void Destroy(Node list){

    }



}
