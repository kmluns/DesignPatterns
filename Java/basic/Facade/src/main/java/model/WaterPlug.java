package model;

/**
 * created by kmluns 28.02.2019
 **/
public class WaterPlug {

    private String where;
    private boolean open;

    private WaterPlug(){
        this.open = false;
    }

    public WaterPlug(String where){
        this();
        this.where = where;
    }

    public String getWhere() {
        return where;
    }

    public boolean isOpen() {
        return open;
    }

    public void switchPlug(){
        this.open = !this.open;
        System.out.println("Switch " + this);
    }

    @Override
    public String toString() {
        return "WaterPlug{" +
                "where='" + where + '\'' +
                ", open=" + open +
                '}';
    }
}
