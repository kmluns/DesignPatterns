package domain.Car;

/**
 * Created by kmluns on 30.12.2018
 */
public class CarFactory {

    public static <T> T createCar(Class aClass) throws IllegalAccessException, InstantiationException {
        return (T) aClass.newInstance();
    }


}
