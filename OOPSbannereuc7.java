/**
 * OOPS Banner App
 * UC7: Store Character Pattern in a Class using Inner Static Class
 * 
 * Demonstrates Encapsulation, Modularity, Reusability
 */
public class BannerApp {

    /**
     * Inner Static Class to encapsulate
     * a character and its 7-line banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * 
         * @param character the alphabet character
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * 
         * @return 7-line pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to fetch pattern for given character
     * 
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return matching pattern
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7]; // return empty pattern if not found
    }

    /**
     * Utility method to print banner text
     * 
     * @param text word to display
     * @param patterns character pattern mappings
     */
    public static void printBanner(String text, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patterns);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] oPattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] pPattern = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] sPattern = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern)
        };

        System.out.println("\nOOPS Banner App - UC7: Store Character Pattern in a Class\n");

        // Print OOPS banner
        printBanner("OOPS", patterns);
    }
}