package hw7;

import org.jetbrains.annotations.NotNull;

public class Cat {


    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;

    }


    public void eat(Plate plate) {
        satiety=plate.decreaseFood(appetite);


    }

    @Override
    public String toString() {
        return  name + ", satiety=" + satiety;
    }
}


