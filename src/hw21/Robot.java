package hw21;

public class Robot implements Actionable {

    private String name;
   private double maxJumpHeight;
    private int maxRunningDist;

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxJumpHeight(double maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public void setMaxRunningDist(int maxRunningDist) {
        this.maxRunningDist = maxRunningDist;
    }

    public String getName() {
        return name;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getMaxRunningDist() {
        return maxRunningDist;
    }

    @Override
    public void run() {
        System.out.println(name + " пробежал");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул");

    }

    Wall wall = new Wall();



        @Override
    public void act() {
        wall.getHeight();
        if (maxJumpHeight > wall.getHeight()) {
            System.out.println(getName() + " перепрыгнул стену");
        }else{
            System.out.println("Стена слишком высокая");
        }
    }
}
