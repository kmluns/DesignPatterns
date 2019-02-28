package services;

import model.Door;
import model.WaterPlug;

/**
 * created by kmluns 28.02.2019
 **/
public class SecurityService {

    private Door homeGate;
    private WaterPlug waterPlug;

    public SecurityService(){
        homeGate = new Door("Gate");
        waterPlug = new WaterPlug("HomeGeneral");
    }


    public void setAlarmForExiting(){
        homeGate.lockDoor();
        waterPlug.switchPlug();
    }

    public void enterHome(){
        homeGate.unlockDoor();
        waterPlug.switchPlug();
    }


}
