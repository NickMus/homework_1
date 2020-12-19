package hw21;


public class Human implements Actionable {

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

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public String getName() {
        return name;
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


    


    @Override
    public void act() {
        getMaxJumpHeight();
        getName();
        getMaxRunningDist();


    }
}
