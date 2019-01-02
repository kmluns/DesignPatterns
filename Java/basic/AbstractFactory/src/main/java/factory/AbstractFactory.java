package factory;

import car.Car;
import wheel.Wheel;

/**
 * created by kmluns
 **/
public abstract class AbstractFactory {

    public abstract Car getCar(int carModel);

    public abstract Wheel getWheel(int wheelType);

}
