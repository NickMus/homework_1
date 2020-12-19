package hw21;

public class Treadmill implements Overcomable {

    private double distance;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void act(Actionable actionable) {
        actionable.run();
    }
}
