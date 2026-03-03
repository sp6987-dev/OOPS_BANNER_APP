/**
 * OOPSBannerApp
 * 
 * UC4: Display "OOPS" banner using String array and loop
 * to improve modularity, reusability and maintainability.
 * 
 * @author swapnanil
 * @version 4.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Creating banner lines using String.join()
        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Printing banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
