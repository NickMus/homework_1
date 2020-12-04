package hw6;

public class Animals {
    String name;
    static int count;

    public Animals(String name) {
        this.name = name;
        count++;
    }

    int swim(int meters) {
        System.out.println(name + " проплыл " + meters + "м");
        return meters;
    }
    int run(int meters) {
        System.out.println(name + " пробежал " + meters + "м");
        return meters;
    }


}
