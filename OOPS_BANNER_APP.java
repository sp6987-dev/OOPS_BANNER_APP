public class OOPSBannerUC7 {

    static class CharacterPattern {
        char letter;
        String[] pattern;

        CharacterPattern(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " ***** ",
            "*     ",
            "*     ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        String[] o = O.getPattern();
        String[] p = P.getPattern();
        String[] s = S.getPattern();

        for(int i=0;i<7;i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }
}
