package hw7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (n > food) {
            return false;
        }
        food -= n;
        return true;

    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int addFood(int a) {
        food += a ;
        return food;
    }

}


