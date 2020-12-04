package hw6;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    int run(int meters) {
        if (meters > 0 && meters <= 500)
            return super.run(meters);
            return meters;
    }

    @Override
    int swim(int meters) {
        if (meters > 0 && meters <= 10)
        return super.swim(meters);
        return meters;
    }
}
