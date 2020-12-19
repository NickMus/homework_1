package hw21;

public class Wall implements  Overcomable {

    private double height;


//    public Wall(double height) {
//        this.height = height;
//    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public void act(Actionable actionable) {
        actionable.jump();
    }

}





