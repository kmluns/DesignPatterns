package wheel;

/**
 * created by kmluns
 **/
public abstract class Wheel {
    private String type;

    Wheel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                '}';
    }
}
