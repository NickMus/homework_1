package hw7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Cat[] cat = new Cat[5];
            cat[0] = new Cat("cat1", 10, false);
            cat[1] = new Cat("cat2", 120, false);
            cat[2] = new Cat("cat3", 24, false);
            cat[3] = new Cat("cat4", 16, false);
            cat[4] = new Cat("cat5", 9, false);
            Plate plate = new Plate(100);
            plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);

        }

        System.out.println(Arrays.toString((cat)));

            plate.info();
            plate.addFood(71);
            plate.info();

        }


    }

