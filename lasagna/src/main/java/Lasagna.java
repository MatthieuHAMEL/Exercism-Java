public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int iTimeSpentInOven) {
        return expectedMinutesInOven() - iTimeSpentInOven;
    }

    public int preparationTimeInMinutes(int iNbLayers) {
        return 2 * iNbLayers;
    }

    public int totalTimeInMinutes(int iNbLayers, int iTimeSpentInOven) {
        return preparationTimeInMinutes(iNbLayers) + iTimeSpentInOven;
    }
}
