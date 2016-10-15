// Vadim Castro



import javax.swing.JOptionPane;

public class HW3 {


    public static void main(String[] args) {

        String menu = "Enter the number of the task you would like to perform: " +
                    "\n\n1. Insert a string in alphabetical order" +
                    "\n2. Find a certain node/value" +
                    "\n3. Traverse the list forwards with printed values" +
                    "\n4. Traverse the list backwards with printed values" +
                    "\n5. Delete a certain node/value" + "\n6. Destroy entire list" + "\n7.Exit";

        String option = JOptionPane.showInputDialog(null,menu);


        DoublyLinkedList product = new DoublyLinkedList();

        while(!(option.equals("7"))){

            // switch statement dictates activation of methods based on users' number choice

            switch(option){

                case "1":
                String cont = "y";

                while(cont.equalsIgnoreCase("y")){
                    String a = JOptionPane.showInputDialog(null, "Enter the string you would like to insert: ");
                    product.AlphaInsert(a);
                    cont = JOptionPane.showInputDialog(null,"Would you like to make another entry? (Y/N)");
                }

                break;


                case "2":
                String b = JOptionPane.showInputDialog(null, "Enter the value of the node you are trying to find: ");
                Node n = new Node(b);
                product.FindNode(n);
                break;


                case "3":
                product.TravFor();
                break;


                case "4":
                product.TravBack();
                break;


                case "5":
                String c = JOptionPane.showInputDialog(null, "Enter the value of the node you are trying to delete: ");
                product.DeleteNode(c);
                break;


                case "6":
                product.Destroy();
                break;


                case "7":
                break;


                default:
                JOptionPane.showMessageDialog(null,"Incorrect input. Please enter the proper number choice");


        }

        option = JOptionPane.showInputDialog(null,menu);


        }
    }

}





