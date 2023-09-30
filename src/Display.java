public class Display {
    //takes results and outputs appropriate values to console
    public static String found(String out){
        System.out.println("Added to cart:  " + out);
        return null;
    }

    public static String notFound(){
        System.out.println("Product ID does not match any ID in the database");
        return null;
    }

    public static String err(String out){
        System.err.println("Error reading the file: " + out);
        return null;
    }
}
