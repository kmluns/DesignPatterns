package singleton.app;

import singleton.billpugh.BillPughSingletonBasic;
import singleton.domain.Account;
import singleton.eager.EagerSingletonBasic;
import singleton.eager.EagerSingletonStaticBlockBasic;
import singleton.lazy.LazySingletonBasic;
import singleton.lazy.LazySingletonThreadSafeBasic;

import java.util.ArrayList;
import java.util.List;

/**
 * created by kmluns
 **/
public class App {

    public void start(){
        eagerSingletonBasic();
        eagerSingletonStaticBlockBasic();

        lazySingletonBasic();
        lazySingletonThreadSafeBasic();

        billPughSingletonBasic();
    }

    private void eagerSingletonBasic(){
        startPrint("eagerSingletonBasic");
        EagerSingletonBasic eagerSingletonBasic = EagerSingletonBasic.getInstance();
        System.out.println(eagerSingletonBasic.getUsername());
        changeUsername(eagerSingletonBasic,"NEW_USERNAME");
        EagerSingletonBasic newEagerSingletonBasic = EagerSingletonBasic.getInstance();
        System.out.println(newEagerSingletonBasic.getUsername());
        finishedPrint("eagerSingletonBasic");
    }

    private void eagerSingletonStaticBlockBasic(){
        startPrint("EagerSingletonStaticBlockBasic");
        EagerSingletonStaticBlockBasic eagerSingletonStaticBlockBasic = EagerSingletonStaticBlockBasic.getInstance();
        System.out.println(eagerSingletonStaticBlockBasic.getUsername());
        changeUsername(eagerSingletonStaticBlockBasic,"NEW_USERNAME");
        EagerSingletonStaticBlockBasic newEagerSingletonStaticBlockBasic = EagerSingletonStaticBlockBasic.getInstance();
        System.out.println(newEagerSingletonStaticBlockBasic.getUsername());
        finishedPrint("EagerSingletonStaticBlockBasic");
    }


    private void lazySingletonBasic(){
        startPrint("LazySingletonBasic");
        LazySingletonBasic lazySingletonBasic = LazySingletonBasic.getInstance();
        System.out.println(lazySingletonBasic.getUsername());
        changeUsername(lazySingletonBasic,"NEW_USERNAME");
        LazySingletonBasic newLazySingletonBasic = LazySingletonBasic.getInstance();
        System.out.println(newLazySingletonBasic.getUsername());
        finishedPrint("LazySingletonBasic");
    }



    private void lazySingletonThreadSafeBasic(){
        startPrint("LazySingletonThreadSafeBasic");
        List<Thread> threads = new ArrayList<Thread>();
        for(int i=0; i < 25; i++){
            final Thread tempThread = new Thread("Thread-"+i) {
                public void run() {
                    LazySingletonThreadSafeBasic lazySingletonThreadSafeBasic = LazySingletonThreadSafeBasic.getInstance();
                    System.out.println("Thread : " + this.getName() + " , account name : " + lazySingletonThreadSafeBasic.getUsername());
                    try {
                        Thread.sleep((long) (Math.random() * 2000));
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    changeUsername(lazySingletonThreadSafeBasic, this.getName());
                    System.out.println("Thread : " + this.getName() + " , change name to " + this.getName());
                }
            };
            threads.add(tempThread);
            // Start thread
            tempThread.start();
        }

        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        finishedPrint("LazySingletonThreadSafeBasic");
    }


    private void billPughSingletonBasic(){
        startPrint("BillPughSingletonBasic");
        List<Thread> threads = new ArrayList<Thread>();
        for(int i=0; i < 25; i++){
            final Thread tempThread = new Thread("Thread-"+i) {
                public void run() {
                    BillPughSingletonBasic billPughSingletonBasic = BillPughSingletonBasic.getInstance();
                    System.out.println("Thread : " + this.getName() + " , account name : " + billPughSingletonBasic.getUsername());
                    try {
                        Thread.sleep((long) (Math.random() * 2000));
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    changeUsername(billPughSingletonBasic, this.getName());
                    System.out.println("Thread : " + this.getName() + " , change name to " + this.getName());
                }
            };
            threads.add(tempThread);
            // Start thread
            tempThread.start();
        }
        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        finishedPrint("BillPughSingletonBasic");
    }




    private boolean changeUsername(Account account, String newUsername){
            account.setUsername(newUsername);
            return true;
    }


    private void startPrint(String procedureType){
        System.out.println(procedureType + " starting");
        System.out.println("-----------------------------");
    }


    private void finishedPrint(String procedureType){
        System.out.println("-----------------------------");
        System.out.println(procedureType + " finished\n");
    }



}
