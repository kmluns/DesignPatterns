package domain.Car;

/**
 * Created by kmluns on 30.12.2018
 */
public class CarFactory {

    public static int BMW = 0;
    public static int HONDA = 1;

    public static Car createCar(int carType) throws IllegalAccessException, InstantiationException {
        Car car = null;

        switch (carType) {
            case 0: {
                car = new BMW();
                break;
            }
            case 1:{
                car = new Honda();
                break;
            }
        }
        return car;
    }


}
