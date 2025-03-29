class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    ProductionRemoteControlCar() {
        this.distanceTravelled = 0;
        this.nbVictories = 0;
    }

    public void drive() {
        this.distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.nbVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.nbVictories = numberOfVictories;
    }

    // Comparable
    public int compareTo(ProductionRemoteControlCar o) {
        if (this.getNumberOfVictories() > o.getNumberOfVictories()) {
            return -1;
        }
        else if (this.getNumberOfVictories() < o.getNumberOfVictories()) {
            return 1;
        }
        return 0;
    }

    private int distanceTravelled;
    private int nbVictories;
}
