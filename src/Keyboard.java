import java.util.Scanner;

public class Keyboard {
    public static String  input() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nEnter product id");
        String prodid = myObj.nextLine();  // Read user input
        return prodid;
    }
}
