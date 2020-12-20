package hw21;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall();
        wall.setHeight(1.4);
        wall.getHeight();

        Treadmill treadmill = new Treadmill();
        treadmill.setDistance(5.0);


        Human human = new Human();
        human.setName("Mike");
        human.setMaxJumpHeight(1.5);
        human.setMaxRunningDist(40);
        human.setOnDistance(true);


//        wall.act(human);
//        human.jump();
//        human.run();


        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setMaxJumpHeight(1.2);
        cat.setMaxRunningDist(3);
        cat.setOnDistance(true);

//        wall.act(cat);
//        cat.run();
//        cat.jump();


        Robot robot = new Robot();
        robot.setName("WallE");
        robot.setMaxJumpHeight(0.15);
        robot.setMaxRunningDist(23);
        robot.setOnDistance(true);


//        wall.act(robot);
//        robot.run();
//        robot.jump();


        Actionable[] players = new Actionable[3];
        players[0] = human;
        players[1] = cat;
        players[2] = robot;

        Overcomable[] overcome = new Overcomable[2];
        overcome[0] = wall;
        overcome[1] = treadmill;


        for (Actionable player : players) {
            for (Overcomable overcomable : overcome) {
                overcomable.act(player);
                if (!player.onDistance()) {
                    break;
                }

            }


        }


    }
}

