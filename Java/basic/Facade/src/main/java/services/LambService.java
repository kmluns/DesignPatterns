package services;

import model.Lamb;

/**
 * created by kmluns 28.02.2019
 **/
public class LambService {

    private Lamb kitchenLamb;
    private Lamb livingRoomLamb;

    public LambService(){
        this.kitchenLamb = new Lamb("kitchen");
        this.livingRoomLamb = new Lamb("livingRoom");
    }


    public void toggleKitchenLamb(){
        this.kitchenLamb.toggleLight();
    }

    public void toggleLivingRoomLamb(){
        this.livingRoomLamb.toggleLight();
    }

}
