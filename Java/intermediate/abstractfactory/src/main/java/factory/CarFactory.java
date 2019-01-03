package factory;

import domain.car.Car;
import domain.wheel.Wheel;

/**
 * Created by kmluns on 2.01.2019
 */
public class CarFactory extends AbstractFactory {
    @Override
    public <T extends Car> T getCarFactory(Class aClass) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Object newObject = aClass.newInstance();
        if(newObject instanceof Car)
            return (T)newObject;
        throw new ClassNotFoundException();
    }

    @Override
    public <T extends Wheel> T getWheelFactory(Class aClass){
        throw new UnsupportedOperationException();
    }
}
