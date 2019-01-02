package singleton.lazy;

import singleton.domain.Account;

/**
 * created by kmluns
 **/
public class LazySingletonBasic extends Account {

    private static LazySingletonBasic instance = null;

    private LazySingletonBasic(){}

    public static LazySingletonBasic getInstance(){
        if(instance == null)
            instance = new LazySingletonBasic();
        return instance;
    }

}
