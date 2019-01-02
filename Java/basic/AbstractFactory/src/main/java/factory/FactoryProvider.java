package factory;

/**
 * created by kmluns
 **/
public class FactoryProvider {

    public static final int CarFactory = 1;
    public static final int WheelFactory = 2;

    public static AbstractFactory getFactory(int factoryType) {
        AbstractFactory abstractFactory = null;
        switch (factoryType) {
            case CarFactory: {
                abstractFactory = new CarFactory();
                break;
            }
            case WheelFactory: {
                abstractFactory = new WheelFactory();
            }
        }
        return abstractFactory;
    }

}
