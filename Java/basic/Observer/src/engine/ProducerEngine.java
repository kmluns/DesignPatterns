package engine;

/**
 * Created by kmluns on 5/9/2018.
 */
public class ProducerEngine extends Engine {
    public ProducerEngine(String name) {
        super(name);
    }


    @Override
    public void producePart(){
        super.producePart();
        System.out.println(getProcessPart() + " , " + " produced by -> "  + getName() );
        notifyObserver();
    }
}
