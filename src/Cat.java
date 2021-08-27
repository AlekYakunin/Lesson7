public class Cat {
    private String name;
    private int appetite;
    private boolean full;


    public Cat(String name, int appetite, boolean full){
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }
    public void eat(Plate myPlate){
        if (full) {
            System.out.println("Кот " + name + " сыт");
        } else
        if (myPlate.getPlateVolume() >= appetite) {
            System.out.println("Кот " + name + " кушает");
            myPlate.decreaseFood(appetite);
            full = true;
        } else {
                System.out.println("В миске недостаточно корма");

        }

    }

}