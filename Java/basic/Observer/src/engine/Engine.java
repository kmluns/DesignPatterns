package engine;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kmluns on 5/9/2018.
 */
public abstract class Engine implements Observable {

    private List<Observer> listeners = new ArrayList<>();

    protected String name;
    protected String processPart;
    protected boolean finish;
    protected boolean process;


    public Engine(String name) {
        this.name = name;
        this.processPart = null;
        this.finish = false;
        this.process = false;
    }


    public String takePart() {
        String part= null;
        if (this.processPart != null) {
            part = this.processPart;
            this.processPart = null;
            this.finish = false;
            this.process = false;
        }
        return part;
    }


    public void producePart() {
        if (this.processPart != null) {
            try {
                Thread.sleep(1000);
                finish = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean pushPart(String part) {
        if (this.processPart == null) {
            this.processPart = part;
            this.process = true;
            producePart();
        }
        return false;
    }


    public boolean isProcess() {
        return process;
    }

    public boolean isFinish() {
        return finish;
    }

    public String getName() {
        return name;
    }

    public String getProcessPart() {
        return processPart;
    }


    @Override
    public void addObserver(Observer observer){
        listeners.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        listeners.remove(observer);
    }

    @Override
    public void notifyObserver(){
        // notify all the listeners
        listeners.forEach(listener -> {
            listener.finishProcude(this);
        });
    }



}
