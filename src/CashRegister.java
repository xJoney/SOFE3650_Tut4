/*
Jonathan Hua 100754458 | Sehar Ahmed 100808249 | Ahmed Darwish 100754743
notes:
Models: Cash Register, Database
Views: Display, Ticket
Controllers: Scanner, Keyboard
 */
import java.io.*;
public class CashRegister
{
    static Display disp = new Display();
    static Keyboard keyboard = new Keyboard();

    public static void main(String[] args) throws FileNotFoundException {
        String file = "C:\\Users\\jonat\\IdeaProjects\\SOFE3650_Tut3\\src\\Products.txt";

        for(int i=0;i<6;i++){
            try {
                // Search for the number and output the matching line
                int prodid = Integer.parseInt(keyboard.input()); //takes user input of ID
                search(file, prodid);
            } catch (IOException e) {
//              System.err.println("Error reading the file: " + e.getMessage());
                disp.err(e.getMessage());
            }
        }
    }


    public static void search(String file, int prodID) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {      // Check if the line contains the target number
                if (line.contains(String.valueOf(prodID))) {
                    disp.found(line); //outputs the matching number line
                    return; //returns after match has been found
                }
            }
            disp.notFound(); //output if no id is found
        }
    } //end of searchLine
}//end of class

