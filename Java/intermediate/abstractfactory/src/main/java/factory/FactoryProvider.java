package factory;

/**
 * Created by kmluns on 2.01.2019
 */
public class FactoryProvider {

    public static <T extends AbstractFactory> T getFactory(Class aClass) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Object newObject = aClass.newInstance();
        if(newObject instanceof AbstractFactory)
            return (T)newObject;
        throw new ClassNotFoundException();
    }
}
