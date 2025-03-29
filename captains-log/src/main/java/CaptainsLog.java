import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[this.random.nextInt(0, PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + Integer.toString(this.random.nextInt(1000, 10000));
    }

    double randomStardate() {
        return 41000.0 + random.nextDouble() * 1000;
    }
}
