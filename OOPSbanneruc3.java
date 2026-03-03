public class BannerAppUC3 {

    public static void main(String[] args) {
        // 7 lines for OOPS banner
        printBannerLine("*******", "*******", "*******", "*******");
        printBannerLine("*     *", "*     *", "*     *", "*      ");
        printBannerLine("*     *", "*     *", "*     *", "*      ");
        printBannerLine("*     *", "*     *", "*******", " ***** ");
        printBannerLine("*     *", "*     *", "*      ", "      *");
        printBannerLine("*     *", "*     *", "*      ", "*     *");
        printBannerLine("*******", "*******", "*      ", " ***** ");
    }

    private static void printBannerLine(String line1, String line2, String line3, String line4) {
        System.out.println(String.join(" ", line1, line2, line3, line4));
    }
}
