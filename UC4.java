/**
 * OOPSBannerApp
 * UC4: Refactor banner using String Array and Loop for better modularity
 * 
 * @author Ashwin
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("   ",
                        "*     *",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("   ",
                        "*     *",
                        "*",
                        "*",
                        "*"),

                String.join("   ",
                        "*     *",
                        "*",
                        "*",
                        "*"),

                String.join("   ",
                        " ***** ",
                        "*",
                        " ***** ",
                        "*")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
