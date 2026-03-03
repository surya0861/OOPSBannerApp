import java.util.HashMap;
import java.util.Map;

public class OOPSbanneruc8 {

    // Utility method to build and return the character pattern map
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for 'O'
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for 'P'
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for 'S'
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    // Utility method to render banner text
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int height = 5; // Each character pattern has 5 rows

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }
}