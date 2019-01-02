package factory;

import domain.car.Car;
import domain.wheel.Wheel;

/**
 * created by kmluns
 **/
public abstract class AbstractFactory {

    public abstract Car getCar(int carModel);

    public abstract Wheel getWheel(int wheelType);

}
