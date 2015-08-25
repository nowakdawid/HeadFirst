package _239;

public class MyAnimalList {

    private Animal[] animals = new Animal[5];
    private int i = 0;

    public void addAnimal(Animal a) {

        if (i < animals.length) {
            animals[i] = a;
            System.out.println("Animal added at " + i + " position!");
            i++;
        }

    }

}
