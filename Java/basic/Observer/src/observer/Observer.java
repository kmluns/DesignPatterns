package observer;

import engine.Engine;

/**
 * Created by kmluns on 5/9/2018.
 */
public interface Observer {

    //to be called by Observeable
    public void finishProcude(Engine engine);
}
