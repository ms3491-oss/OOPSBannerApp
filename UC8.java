import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - Banner App using Map Collection
 */
public class UC8 {

    public static void main(String[] args) {

        // Map to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', getOPattern());
        patternMap.put('P', getPPattern());
        patternMap.put('S', getSPattern());

        String word = "OOPS";

        // Print banner
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c)[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    // Pattern for O
    public static String[] getOPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    // Pattern for P
    public static String[] getPPattern() {
        return new String[]{
                " ****** ",
                "*     * ",
                "*     * ",
                " ****** ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // Pattern for S
    public static String[] getSPattern() {
        return new String[]{
                " ****** ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "      * ",
                " ****** "
        };
    }
}