package strategy.model;

public class Mosquito {

    private int speed;
    private int size;

    public Mosquito(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Mosquito{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }
}
