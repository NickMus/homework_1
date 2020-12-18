package hw21;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall();
        wall.setHeight(1);

        Human human = new Human();
        human.setName("Mike");
        human.setMaxJumpHeight(1.5);
        human.setMaxRunningDist(40);

        human.act();


        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setMaxJumpHeight(1.2);
        cat.setMaxRunningDist(3);

        cat.act();


        Robot robot = new Robot();
        robot.setName("WallE");
        robot.setMaxJumpHeight(0.15);
        robot.setMaxRunningDist(23);










    }
}
