import engine.Engine;
import engine.ProducerEngine;
import engine.UpgradeEngine;
import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kmluns on 5/9/2018.
 */
public class Factory implements Observer {

    private List<Observable> observableList = null;


    private List<Engine> producerEngineList;
    private List<Engine> upgraderEngineList;
    private LinkedList<String> parts;
    private boolean finish;


    public Factory() {

        observableList = new ArrayList<>();

        producerEngineList = new LinkedList<>();
        upgraderEngineList = new LinkedList<>();
        parts = new LinkedList<>();
        finish = false;


        for (int i = 0; i < 10; i++) {
            ProducerEngine tempProducerEngine = new ProducerEngine("producer engine - " + i);
            tempProducerEngine.addObserver(this);
            UpgradeEngine tempUpgradeEngine = new UpgradeEngine("upgrader engine - " + i);
            tempUpgradeEngine.addObserver(this);
            producerEngineList.add(tempProducerEngine);
            upgraderEngineList.add(tempUpgradeEngine);
        }
        observableList.addAll(producerEngineList);
        observableList.addAll(upgraderEngineList);
        for (int i = 0; i < 30; i++) {
            parts.add(new String("part - " + i));
        }


    }


    public void run() {

        while (!finish) {

            producerEngineList.forEach(engine -> {
                if (parts.size() > 0) {
                    if (!engine.isProcess()) {
                        engine.pushPart(parts.pop());
                    }
                }
            });


            if (parts.size() == 0) {
                finish = true;
            }

        }


        //Cleaning observables
        observableList.forEach(this::unsubscribe);
    }

    public void upgradePart(Engine engine) {
        boolean wait = false;
        while (!wait) {
            for (Engine upgraderEngine : upgraderEngineList) {
                if (!upgraderEngine.isProcess()) {
                    upgraderEngine.addObserver(this);
                    upgraderEngine.pushPart(engine.takePart());
                    wait = true;
                    break;
                }
            }
        }
    }


    @Override
    public void finishProcude(Engine engine) {
        if(engine instanceof  ProducerEngine)
            upgradePart(engine);
        if(engine instanceof  UpgradeEngine){
            engine.takePart();

            //To sort upgraderEngineList
            // Remove upgraderEngine from linkedlist
            upgraderEngineList.remove(engine);
            // Add upgraderEngine to linkedlist, cause will be last
            upgraderEngineList.add(engine);
        }
    }

    private void unsubscribe(Observable observable) {
        observable.removeObserver(this);
    }
}
