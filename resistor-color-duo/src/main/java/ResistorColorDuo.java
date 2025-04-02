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

class ResistorColorDuo {
    int value(String[] colors) {
        return 10 * ColorCodes.valueOf(colors[0]).getValue() 
            + ColorCodes.valueOf(colors[1]).getValue();
    }
}
