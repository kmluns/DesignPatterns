package singleton.billpugh;

import singleton.domain.Account;

/**
 * created by kmluns
 **/
public class BillPughSingletonBasic extends Account {

    private BillPughSingletonBasic(){}

    private static class SingletonHelper{
        private static final BillPughSingletonBasic INSTANCE = new BillPughSingletonBasic();
    }

    public static BillPughSingletonBasic getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
