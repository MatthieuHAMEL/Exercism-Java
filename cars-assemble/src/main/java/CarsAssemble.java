public class CarsAssemble {
    private static final int NB_PRODUCED_CARS_PER_SPEED_UNIT = 221;

    static private double successRate(int speed) {
        if (speed <= 4) {
            return 1.0;
        }
        if (speed <= 8) {
            return 0.9;
        }
        if (speed == 9) {
            return 0.8;
        }
        if (speed == 10) {
            return 0.77;
        }
        return 0;
    }
    public double productionRatePerHour(int speed) {
        return (double) speed * NB_PRODUCED_CARS_PER_SPEED_UNIT * successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
