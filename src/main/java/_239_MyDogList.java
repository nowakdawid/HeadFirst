public class _239_MyDogList {

    private Dog[] dogs = new Dog[5];
    private int i = 0;

    public void addDog(Dog dog) {

        if (i < dogs.length) {
            dogs[i] = dog;
            System.out.println("Dog added at " + i + " position!");
            i++;
        }

    }

}
