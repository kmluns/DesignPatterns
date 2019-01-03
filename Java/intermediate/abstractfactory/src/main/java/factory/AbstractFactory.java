package factory;

import domain.car.Car;
import domain.wheel.Wheel;

/**
 * Created by kmluns on 2.01.2019
 */
public abstract class AbstractFactory {

    public abstract <T extends Car> T getCarFactory(Class aClass) throws IllegalAccessException, InstantiationException, ClassNotFoundException;

    public abstract <T extends Wheel> T getWheelFactory(Class aClass) throws IllegalAccessException, InstantiationException, ClassNotFoundException;

}
