package domain.Car;

/**
 * Created by kmluns on 30.12.2018
 */
public abstract class Car {

    protected int producedYear;
    protected int engineHp;
    protected int door;
    protected String model;


    @Override
    public String toString() {
        return "Car{" +
                "producedYear=" + producedYear +
                ", engineHp=" + engineHp +
                ", door=" + door +
                ", model='" + model + '\'' +
                '}';
    }
}
