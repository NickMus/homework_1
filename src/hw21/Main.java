package hw21;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall();
        wall.setHeight(1.0);

        Treadmill treadmill = new Treadmill();
        treadmill.setDistance(5.0);


        Human human = new Human();
        human.setName("Mike");
        human.setMaxJumpHeight(1.5);
        human.setMaxRunningDist(40);


        wall.act(human);
        human.jump();
        human.run();


        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setMaxJumpHeight(1.2);
        cat.setMaxRunningDist(3);

        wall.act(cat);
        cat.run();
        cat.jump();


        Robot robot = new Robot();
        robot.setName("WallE");
        robot.setMaxJumpHeight(0.15);
        robot.setMaxRunningDist(23);



        wall.act(robot);
        robot.run();
        robot.jump();



        Object[] players = new Object[3];
        players[0] = human;
        players[1] = cat;
        players[2] = robot;

        Object[] overcome = new Object[2];
        overcome[0] = wall;
        overcome[1] = treadmill;


        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < overcome.length; j++) {

            }
        }


    }
}
