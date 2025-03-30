import java.util.Arrays;

enum ColorCodes {
    black(0),
    brown(1),
    red(2),
    orange(3),
    yellow(4),
    green(5),
    blue(6),
    violet(7),
    grey(8),
    white(9);

    private final int val;
    private ColorCodes(int val) {
        this.val = val;
    }

    public int getValue() {
        return val;
    }
}

// NB: It could have been done with a simple map and collecting the array of keys! ...
class ResistorColor {
    int colorCode(String color) {
        return ColorCodes.valueOf(color).getValue();
    }

    // https://stackoverflow.com/questions/13783295/getting-all-names-in-an-enum-as-a-string
    String[] colors() {
        return Arrays.stream(ColorCodes.class.getEnumConstants())
            .map(Enum::name)
            .toArray(String[]::new);
    }
}
