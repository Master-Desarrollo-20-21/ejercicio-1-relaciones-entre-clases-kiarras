

public enum Color {
    RED     ('r'),
    YELLOW  ('y'),
    BLUE    ('b'),
    GREEN   ('g'),
    PURPLE  ('p'),
    ORANGE  ('o');
    
    private char keyword;

    Color(char keyword) {
        this.keyword = keyword;
    }

    public static Color valueOf(char character) {
        for (Color color : values()) {
            if (color.keyword == character) {
                return color;
            }
        }
        return null;
    }
    public static char valueOf(int index) {
        return values()[index].keyword;
    }

    public int getKeyword() {
        return this.keyword;
    }
}
