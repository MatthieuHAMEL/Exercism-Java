public class JedliksToyCar {
  public static JedliksToyCar buy() {
    return new JedliksToyCar();
  }

  public String distanceDisplay() {
    return String.format("Driven %d meters", this.distance);
  }

  public String batteryDisplay() {
    return (battery == 0)
      ? "Battery empty" 
      : String.format("Battery at %d%%", this.battery); // % escaped ... :) 
  }

  public void drive() {
    if (battery > 0) {
      this.distance += DRIVE_DISTANCE_UNIT;
      this.battery -= DRIVE_BATTERY_UNIT;
    }
  }

  private int distance;
  private int battery;
  private static final int DRIVE_DISTANCE_UNIT = 20;
  private static final int DRIVE_BATTERY_UNIT = 1;

  // Public only to make the tests compile, but with a factory it'd be better as private
  public JedliksToyCar() {
    this.distance = 0;
    this.battery = 100;
  }
}
