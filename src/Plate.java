public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood (int appetite) {
        if (appetite < this.food) {
            this.food -= appetite;
        }
    }

    public int getPlateVolume() {
        return this.food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void increaseFood(int countOfFood)
    {
        food += countOfFood;
    }
}
