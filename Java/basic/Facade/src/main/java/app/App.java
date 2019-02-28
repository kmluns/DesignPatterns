package app;

import facade.HomeSecurity;

/**
 * created by kmluns 28.02.2019
 **/
public class App {

    private HomeSecurity homeSecurity;

    public App(){
        homeSecurity = new HomeSecurity();
    }


    public void start(){
        System.out.println("Open door and enter home!!");
        System.out.println("----------------------");

        homeSecurity.enterHome();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("\nLock door and exit home!!");
        System.out.println("----------------------");

        homeSecurity.exitHome();
    }

}
