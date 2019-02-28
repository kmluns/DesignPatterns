package model;

/**
 * created by kmluns 28.02.2019
 **/
public class Lamb {

    private String where;
    private boolean light;

    private Lamb(){
        this.light = false;
    }

    public Lamb(String where){
        this();
        this.where = where;
    }

    public String getWhere() {
        return where;
    }

    public boolean isLight() {
        return light;
    }

    public void toggleLight(){
        this.light = !light;
        System.out.println("Toggle " + this);
    }


    @Override
    public String toString() {
        return "Lamb{" +
                "where='" + where + '\'' +
                ", light=" + light +
                '}';
    }
}
