class NeedForSpeed {
  private int speed;
  private int battery;
  private int batteryDrain;
  private int distanceDriven;

  NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.battery = 100;
    this.batteryDrain = batteryDrain;
    this.distanceDriven = 0;
  }

  // Added batteryDrain() and speed() to implement canFinishRace
  public int batteryDrain() {
    return this.batteryDrain;
  }
  public int speed() {
    return this.speed;
  }

  public boolean batteryDrained() {
    return (this.battery < this.batteryDrain);
  }

  public int distanceDriven() {
    return this.distanceDriven;
  }

  public void drive() {
    if (!batteryDrained()) {
      this.distanceDriven += speed;
      this.battery -= this.batteryDrain;
    }
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(50, 4); 
  }
}

class RaceTrack {
  private int distance;
  RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean canFinishRace(NeedForSpeed car) {
    return ((100 / car.batteryDrain()) * car.speed() >= this.distance);
  }
}
