public class UC4{

    // Main method to run the banner display
    public static void main(String[] args) {

        // String array storing banner lines
        String[] banner = {
            "   ***      ***   ******   ***** ",
            "  ** **    ** **  **   **  **   **",
            " **   **  **   ** **   **  **     ",
            " **   **  **   ** ******   ** ***",
            " **   **  **   ** **            **",
            "  ** **    ** **  **       **   **",
            "   ***      ***   **        *****"
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}