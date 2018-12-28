import model.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * created by kmluns
 **/
public class App  {
    private Person father;
    private Person mother;

    public void start(){

        // Create father
        father = new Person(true);
        father.setName("Remzi");
        father.setSurname("ASLAN");


        // Create mother
        mother = new Person(false);
        mother.setName("Perihan");
        mother.setSurname("ASLAN");


        // Make a child
        Person child = new Person(mother,father,true);
        child.setName("Suleyman");

        // Get Person Class
        Class PersonClass = Person.class;


        // Get Person Class methods
        Method[] personClassMethods = PersonClass.getMethods();

        // Print Person Class methods
        for(Method method : personClassMethods){
            System.out.println(PersonClass + " method = " + method.getName());
        }
        // New line
        System.out.println();

        // Get Person Class Fields
        Field[] personClassFields   = PersonClass.getFields();

        // Print Person Class field
        for(Field field : personClassFields){
            System.out.println(PersonClass + " field -> " + field.getName());
        }
        // New line
        System.out.println();

        // Print child name before call reflection method
        System.out.println("Child Name : "+ child.getName());


        // Change child name with reflaction method
        try {
            Method personClassSetNameMethod = Person.class.getMethod("setName", String.class);
            Object returnValue = personClassSetNameMethod.invoke(child, "Selena");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print child name after call reflection method
        System.out.println("New Child Name : " + child.getName());

        // Change child name with setter reflection function
        child.setFieldWithSetterFunction("name","Osman");

        // Print child name after call setter reflection method
        System.out.println("The most new child name : " + child.getName());

    }


}
