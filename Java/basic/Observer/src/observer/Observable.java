package observer;


/**
 * Created by kmluns on 5/9/2018.
 */
public interface Observable {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
