package singleton.eager;

import singleton.domain.Account;

/**
 * created by kmluns
 **/
public class EagerSingletonBasic extends Account {

    private static final EagerSingletonBasic INSTANCE = new EagerSingletonBasic();

    private EagerSingletonBasic(){}

    public static EagerSingletonBasic getInstance(){
        return INSTANCE;
    }
}
