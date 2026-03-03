public class BannerAppUC5 {

    public static void main(String[] args) {

        // Inline Array Declaration and Initialization using String.join()
        String[] banner = {

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ******",
                    " ******"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    " ******",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"),

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ******",
                    " ***** ")
        };

        // Enhanced For Loop to Print Banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}