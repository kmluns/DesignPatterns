package reflaction;

import java.lang.reflect.Method;

/**
 * created by kmluns
 **/
public interface SetterReflectionFunction {

    /**
     *
     * Setter function name is shouldbe "set<fieldName>"
     *
     * @param fieldName
     * @param value
     * @param <E>
     * @return success or not
     */
    default  <E> boolean  setFieldWithSetterFunction(String fieldName, E value){
        fieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        try {
            Method fieldSetterMethod = getClass().getMethod("set"+fieldName,value.getClass());
            fieldSetterMethod.invoke(this,value);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
