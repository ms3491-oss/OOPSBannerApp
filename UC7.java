/**
 * UC7 - Banner App using Inner Static Class
 */
public class UC7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPattern[] patterns = {
                new CharacterPattern('O', getOPattern()),
                new CharacterPattern('P', getPPattern()),
                new CharacterPattern('O', getOPattern()),
                new CharacterPattern('S', getSPattern())
        };

        // Print banner using StringBuilder
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    // Utility method for O
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

    // Utility method for P
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

    // Utility method for S
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