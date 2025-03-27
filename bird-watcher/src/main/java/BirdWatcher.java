
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    private static final int[] LAST_WEEK_BIRD_COUNTS = {0, 2, 5, 3, 7, 8, 4};
    public int[] getLastWeek() {
        return LAST_WEEK_BIRD_COUNTS.clone(); // Clone to prevent our array from being changed
    }

    /** Today is the last element of the array. */
    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        ++this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public boolean hasDayWithoutBirds() {
        for (int count : this.birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res = 0;
        for (int i = 0; i < Math.min(numberOfDays, this.birdsPerDay.length); i++) {
            res += this.birdsPerDay[i];
        }
        return res;
    }

    private static final int BUSY_DAY_THRESHOLD = 5;
    public int getBusyDays() {
        int nbBusy = 0;
        for (int count: this.birdsPerDay) {
            if (count >= BUSY_DAY_THRESHOLD) {
                ++nbBusy;
            }
        }
        return nbBusy;
    }
}
