package factory;

import domain.car.Car;
import domain.wheel.OEMWheel;
import domain.wheel.SteelWheel;
import domain.wheel.Wheel;

/**
 * created by kmluns
 **/
public class WheelFactory extends AbstractFactory {

    public static final int STEEL = 1;
    public static final int OEM = 2;

    @Override
    public Car getCar(int carModel) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Wheel getWheel(int wheelType) {
        Wheel wheel = null;
        switch (wheelType){
            case STEEL:{
                wheel = new SteelWheel();
                break;
            }
            case OEM:{
                wheel = new OEMWheel();
                break;
            }
        }
        return wheel;
    }
}
