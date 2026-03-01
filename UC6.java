public class UC6 {

    public static void main(String[] args) {

        String[] o1 = getOPattern();
        String[] p = getPPattern();
        String[] o2 = getOPattern();
        String[] s = getSPattern();

        // Loop to print 7 lines
        for (int i = 0; i < 7; i++) {
            System.out.println(o1[i] + " " + p[i] + " " + o2[i] + " " + s[i]);
        }
    }

    // Method for letter O
    public static String[] getOPattern() {

        return new String[] {
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {

        return new String[] {
                " ****** ",
                "*     * ",
                "*     * ",
                " ****** ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {

        return new String[] {
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