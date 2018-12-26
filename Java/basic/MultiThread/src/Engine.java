import java.util.LinkedList;
import java.util.concurrent.Semaphore;

/**
 * Created by kmluns on 5/7/2018.
 */
public class Engine implements Runnable {

    private Thread thread;
    private String engineName;
    private int id;

    private LinkedList<String> partList;


    // Used semaphore
    private static Semaphore semaphore;

    public Engine(String engineName, int id) {
        this.engineName = engineName;
        this.id = id;
        this.partList = null;
        if (this.semaphore == null) {
            // permits -> How many engine work at the same time
            semaphore = new Semaphore(5);
        }
    }


    @Override
    public void run() {
        // Print engine run method
        System.out.println("Running " + engineName);
        try {
            while (partList != null) {
                semaphore.acquire();
                String tempPart;
                if (partList.size() > 0) {
                    tempPart = partList.pop();
                } else {
                    semaphore.release();
                    break;
                }

                // Print which engine works on which part
                System.out.println("Thread: " + engineName + ", " + tempPart + " is working now!");

                // Let the thread sleep for a while for work!
                thread.sleep((id%5) * 500);

                // Print engine finished
                System.out.println("Thread: " + engineName + ", " + tempPart + " is finished now!");


                semaphore.release();

                // The work is not good, so part have to make again
                if (Math.random() > 0.8) {
                    partList.add(tempPart);
                    System.out.println("Thread: " + engineName + ", " + tempPart + " is bad quality");
                    System.out.println("Thread: " + engineName + ", " + tempPart + " have got back to work ");
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + engineName + " interrupted.");
        }
        System.out.println("Thread " + engineName + " exiting.");
    }

    public void start(LinkedList<String> partList) {
        this.partList = partList;
        if (thread == null) {
            // Print engine will be start
            System.out.println("Starting " + engineName);
            thread = new Thread(this, engineName);
            thread.start();

        }
    }


}
