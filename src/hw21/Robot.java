package hw21;

public class Robot implements Actionable {

    private String name;
   private double maxJumpHeight;
    private int maxRunningDist;
    boolean onDistance;

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

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void run(double distance) {
        if (maxRunningDist<distance) {
            System.out.println("Дистанция для " + getName() + " слишком длинная");
            onDistance = false;
        }else{
            System.out.println(getName() + " пробежал");
        }
    }

//    @Override
//    public void jump() {
//        System.out.println(name + " прыгнул");

//    }

    @Override
    public void jump(double height) {
        if (maxJumpHeight<height) {
            System.out.println("стена для " + getName() + " слишком высокая");
            onDistance = false;
        }else{
            System.out.println(getName() + " перепрыгнул");
        }
    }

//    Wall wall = new Wall();



//        @Override
//    public void act() {
//        wall.getHeight();
//        if (maxJumpHeight > wall.getHeight()) {
//            System.out.println(getName() + " перепрыгнул стену");
//        }else{
//            System.out.println("Стена слишком высокая");
//        }
//    }


    @Override
    public boolean onDistance() {
        return onDistance;
    }
}
