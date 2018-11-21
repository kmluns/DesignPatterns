package engine;

/**
 * Created by kmluns on 5/9/2018.
 */
public class UpgradeEngine extends Engine {
    public UpgradeEngine(String name) {
        super(name);
    }


    @Override
    public void producePart(){
        super.producePart();
        try {
            Thread.sleep(2000);
            finish = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getProcessPart() + " , " + " upgraded by -> "  + getName() );
        notifyObserver();
    }
}
