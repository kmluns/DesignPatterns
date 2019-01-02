package app;

import domain.Car.BMW;
import domain.Car.CarFactory;
import domain.Car.Honda;

/**
 * Created by kmluns on 30.12.2018
 */
public class App {


    public void start(){

        try {
            BMW bmw =  (BMW) CarFactory.createCar(CarFactory.BMW);

            Honda honda = (Honda) CarFactory.createCar(CarFactory.HONDA);


            System.out.println(bmw);

            System.out.println(honda);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
