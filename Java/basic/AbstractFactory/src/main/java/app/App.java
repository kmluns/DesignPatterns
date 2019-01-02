package app;

import car.Car;
import factory.AbstractFactory;
import factory.CarFactory;
import factory.FactoryProvider;
import factory.WheelFactory;
import wheel.Wheel;

/**
 * created by kmluns
 **/
public class App {


    public void start() {

        AbstractFactory carFactory = FactoryProvider.getFactory(FactoryProvider.CarFactory);
        Car bmw520 = carFactory.getCar(CarFactory.BMW520);
        Car audiA3 = carFactory.getCar(CarFactory.AUDIA3);

        AbstractFactory wheelFactory = FactoryProvider.getFactory(FactoryProvider.WheelFactory);
        Wheel steelWheel = wheelFactory.getWheel(WheelFactory.STEEL);
        Wheel oemWheel = wheelFactory.getWheel(WheelFactory.OEM);

        System.out.println(steelWheel);
        System.out.println(oemWheel);

        bmw520.getWheel().add(steelWheel);
        audiA3.getWheel().add(oemWheel);

        System.out.println(bmw520);
        System.out.println(audiA3);

    }


}
