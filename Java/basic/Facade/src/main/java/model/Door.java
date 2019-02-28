package model;

/**
 * created by kmluns 28.02.2019
 **/
public class Door {
    private String where;
    private boolean lock;

    private Door(){
        this.lock = false;
    }

    public Door(String where){
        this();
        this.where = where;
    }

    public String getWhere() {
        return where;
    }

    public boolean isLock() {
        return lock;
    }

    public void lockDoor(){
        this.lock = true;
        System.out.println("Lock " + this);
    }

    public void unlockDoor(){
        this.lock = false;
        System.out.println("Unlock " + this);
    }

    @Override
    public String toString() {
        return "Door{" +
                "where='" + where + '\'' +
                ", lock=" + lock +
                '}';
    }
}
