package facade;

import services.SecurityService;
import services.LambService;

/**
 * created by kmluns 28.02.2019
 **/
public class HomeSecurity {

    private SecurityService securityService;
    private LambService lambService;

    public HomeSecurity(){
        securityService = new SecurityService();
        lambService = new LambService();
    }



    public void enterHome(){
        securityService.enterHome();
        lambService.toggleKitchenLamb();
        lambService.toggleLivingRoomLamb();
    }

    public void exitHome(){
        securityService.setAlarmForExiting();
        lambService.toggleLivingRoomLamb();
        lambService.toggleKitchenLamb();
    }



}
