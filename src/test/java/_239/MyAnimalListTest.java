package _239;

public class MyAnimalListTest {

    public static void main(String[] args) {

        MyAnimalList MyAnimalList = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        MyAnimalList.addAnimal(dog);
        MyAnimalList.addAnimal(cat);
        MyAnimalList.addAnimal(dog);
        MyAnimalList.addAnimal(cat);
        MyAnimalList.addAnimal(dog);
        MyAnimalList.addAnimal(cat);
        MyAnimalList.addAnimal(dog);
        MyAnimalList.addAnimal(cat);

    }

}
