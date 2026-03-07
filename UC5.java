public class UC5 {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Inline initialization using String.join()
        String[] lines = {
            String.join(" ", " *** ", " *** ", "*******", " ***** "),
            String.join(" ", "**  **", "**  **", "**   **", "**   **"),
            String.join(" ", "**  **", "**  **", "**   **", "**"),
            String.join(" ", "**  **", "**  **", "*******", " *** "),
            String.join(" ", "**  **", "**  **", "**", "    **"),
            String.join(" ", "**  **", "**  **", "**", "   **  **"),
            String.join(" ", " *** ", "  *** ",  "**", "   ***** ")
        };

        // Loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}