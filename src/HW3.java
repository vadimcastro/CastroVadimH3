
import javax.swing.JOptionPane;

public class HW3 {



    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null,"Enter the string you would like to insert: ");
        String input2 = JOptionPane.showInputDialog(null,"Enter the string you would like to insert: ");
        String input3 = JOptionPane.showInputDialog(null,"Enter the string you would like to insert: ");


        DoublyLinkedList one = new DoublyLinkedList();



        one.AlphaInsert(input);
        one.AlphaInsert(input2);
        one.AlphaInsert(input3);

        Node start = one.head;

        while (start != null) {
            System.out.println(start.value);
            start = start.getNext();
        }

    }

}





