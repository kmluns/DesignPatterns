package factory;

import car.AudiA3;
import car.BMW520;
import car.Car;
import wheel.Wheel;

/**
 * created by kmluns
 **/
public class CarFactory extends AbstractFactory {

    public static final int BMW520 = 1;
    public static final int AUDIA3 = 2;

    @Override
    public Car getCar(int carModel) {
        Car car = null;

        switch (carModel) {
            case BMW520: {
                car = new BMW520();
                break;
            }
            case AUDIA3: {
                car = new AudiA3();
                break;
            }
        }
        return car;
    }

    @Override
    public Wheel getWheel(int wheelType) {
        throw new UnsupportedOperationException();
    }
}
