import java.util.LinkedList;
import java.util.List;

/**
 * Created by kmluns on 5/8/2018.
 */
public class Factory {

    private List<Engine> engineList;

    private volatile LinkedList<String> partList;


    public Factory() {
        engineList = new LinkedList<>();
        partList = new LinkedList<>();

        // Create Engines
        for (int i = 0; i < 50; i++) {
            Engine tempEngine = new Engine("Engine - " + (i + 1),(i+1));
            engineList.add(tempEngine);
        }

        // Create Parts
        for (int i = 0; i < 1000; i++) {
            partList.add(new String("Part - " + (i + 1)));
        }
    }


    public void run() {


        // Start all engines
        engineList.forEach(engine -> {
            engine.start(partList);
        });




    }

}
