package hw6;

public class Cat extends Animals {




    public Cat(String name) {
        super(name);
    }


    @Override
    int run(int meters) {
        if (meters > 0 && meters <= 200)
            return super.run(meters);
        return meters;
    }

    @Override
    int swim(int meters) {
        if (meters > 0) {
            System.out.println("Кот не умеет плавать");
        return meters;
        }
        return super.swim(meters);
    }
}
