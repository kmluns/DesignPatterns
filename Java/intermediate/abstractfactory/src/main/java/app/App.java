package app;

import domain.car.AudiA3;
import domain.car.BMW520;
import domain.car.Car;
import domain.wheel.OEMWheel;
import domain.wheel.SteelWheel;
import domain.wheel.Wheel;
import factory.CarFactory;
import factory.FactoryProvider;
import factory.WheelFactory;

/**
 * Created by kmluns on 2.01.2019
 */
public class App {

    public void start() {
        try {
            CarFactory carFactory = FactoryProvider.getFactory(CarFactory.class);
            Car bmw = carFactory.getCarFactory(BMW520.class);
            Car audi = carFactory.getCarFactory(AudiA3.class);

            System.out.println(bmw);
            System.out.println(audi);

            WheelFactory wheelFactory = FactoryProvider.getFactory(WheelFactory.class);
            Wheel steelWheel = wheelFactory.getWheelFactory(SteelWheel.class);
            Wheel oemWheel = wheelFactory.getWheelFactory(OEMWheel.class);

            System.out.println(steelWheel);
            System.out.println(oemWheel);

            for (int i = 0; i < 4; i++) {
                bmw.getWheel().add(oemWheel);
                audi.getWheel().add(steelWheel);
            }

            System.out.println(bmw);
            System.out.println(audi);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The Factory can not be initialized!");
        }
    }
}
