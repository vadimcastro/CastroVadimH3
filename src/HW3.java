
import javax.swing.JOptionPane;

public class HW3 {



    public static void main(String[] args) {

        DoublyLinkedList one = new DoublyLinkedList();

        String input = JOptionPane.showInputDialog(null,"Enter the string you would like to insert: ");
        one.AlphaInsert(input);

        String input2 = JOptionPane.showInputDialog(null,"Enter the string you would like to insert: ");
        one.AlphaInsert(input2);

        String input3 = JOptionPane.showInputDialog(null,"Enter the string you would like to insert: ");
        one.AlphaInsert(input3);

        Node start = one.head;

        while (start != null) {
            System.out.println(start.getValue());
            start = start.getNext();
        }



    }

}





