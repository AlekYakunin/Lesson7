import java.lang.reflect.Array;

public class Lesson7 {
    public static void main(String[] args) {
        Cat [] catArray = new Cat[5];
        catArray[0] = new Cat("Мурзик",10, false);
        catArray[1] = new Cat("Томас",30, false);
        catArray[2] = new Cat("Рыжик",5, true);
        catArray[3] = new Cat("Максик",10, false);
        catArray[4] = new Cat("Муся",30, false);
        Plate firstPlate = new Plate(50);

        for (int i = 0; i < catArray.length; i++) {
            firstPlate.info();
            catArray[i].eat(firstPlate);
        }

        firstPlate.increaseFood(50);

        for (int i = 0; i < catArray.length; i++) {
            firstPlate.info();
            catArray[i].eat(firstPlate);
        }

        firstPlate.info();

       // System.out.println(firstCat.name + " Аппетит " + firstCat.appetite);
    }

}
