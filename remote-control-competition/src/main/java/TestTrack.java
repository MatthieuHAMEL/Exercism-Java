import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        var res = new ArrayList<ProductionRemoteControlCar>();
        for (var car : cars) {
            res.add(car);
        }
        res.sort(null);
        return res;
    }
}
