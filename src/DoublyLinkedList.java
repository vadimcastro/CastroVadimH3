/**
 * Created by vadimcastro on 10/9/16.
 */
public class DoublyLinkedList {

    public class List{
        Node head;

        List(){
            this.head = null;
        }

    }



    public class Node {

        private String value;
        private Node next;

        public Node(String val, Node n){
            this.value = val;
            this.next = n;
        }

        public String getValue(){
            return this.value;
        }

        public Node getNext(){
            return this.next;
        }


    }

    /**
     * AlphaInsert method inserts a new node into an existing list in alphabetical order
     * @param list the list for the node to be inserted into
     */

    public void AlphaInsert(Node list){

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
