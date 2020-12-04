package hw6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Dog fresh = new Dog("Fresh");
        Cat monya = new Cat("Monya");

        fresh.swim(9);
        fresh.run(120);

        monya.run(10);
        monya.swim(2);


        System.out.println(Animals.count);



    }
}
