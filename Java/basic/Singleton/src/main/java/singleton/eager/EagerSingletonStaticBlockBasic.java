package singleton.eager;

import singleton.domain.Account;

/**
 * created by kmluns
 **/
public class EagerSingletonStaticBlockBasic extends Account {

    private static EagerSingletonStaticBlockBasic instance;

    static {
        try{
            instance = new EagerSingletonStaticBlockBasic();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private EagerSingletonStaticBlockBasic(){}

    public static EagerSingletonStaticBlockBasic getInstance(){
        return instance;
    }

}
