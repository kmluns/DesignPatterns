package singleton.lazy;

import singleton.domain.Account;

/**
 * created by kmluns
 **/
public class LazySingletonThreadSafeBasic extends Account {

    private static LazySingletonThreadSafeBasic instance = null;

    private LazySingletonThreadSafeBasic(){}

    public static synchronized LazySingletonThreadSafeBasic getInstance(){
        if(instance == null)
            instance = new LazySingletonThreadSafeBasic();
        return instance;
    }
}
