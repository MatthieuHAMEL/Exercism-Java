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

class ResistorColorTrio {
    private static final String[] prefixes = {
        "", // No prefix 
        "kilo", 
        "mega", 
        "giga"
    };

    String prefixedOhms(long n) { 
        int cnt = 0;
        while (n / 1000 != 0) {
            cnt++;
            n = n / 1000;
        }
        if (cnt >= prefixes.length) { // Prefix not supported
            throw new IllegalArgumentException("Ohms value is too big!");
        }
        return Long.toString(n) + " " + prefixes[cnt] + "ohms";
    }

    String label(String[] colors) {
        final long res = (10 * (long) ColorCodes.valueOf(colors[0]).getValue()
            + (long) ColorCodes.valueOf(colors[1]).getValue()) 
          * (long) Math.pow(10, ColorCodes.valueOf(colors[2]).getValue());

        return prefixedOhms(res);
    }
}
