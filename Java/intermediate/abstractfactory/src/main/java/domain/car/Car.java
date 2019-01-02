package domain.car;

import domain.wheel.Wheel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kmluns on 2.01.2019
 */
public abstract class Car {

    private String model;
    private int producedYear;
    private String type;
    private List<Wheel> wheel;

    Car(String model, int producedYear, String type) {
        this.model = model;
        this.producedYear = producedYear;
        this.type = type;
        wheel = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProducedYear() {
        return producedYear;
    }

    public void setProducedYear(int producedYear) {
        this.producedYear = producedYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Wheel> getWheel() {
        return wheel;
    }

    public void setWheel(List<Wheel> wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producedYear=" + producedYear +
                ", type='" + type + '\'' +
                ", domain.wheel=" + wheel +
                '}';
    }
}
