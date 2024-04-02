package animals;

public class Main {
    public static void main(String[] args) {

        /**
         * Creating objects of the subclasses
         */

        Mammal dog = new Mammal("Dog", "Land", 5, true);
        Bird eagle = new Bird("Eagle", "Sky", 10, true);
        Fish salmon = new Fish("Salmon", "Water", 2, true);

        /**
         * Displaying the details of the objects
         */

        System.out.println(dog);
        System.out.println(eagle.toString());
        System.out.println(salmon);

        /**
         * Making noise
         */

        dog.makeNoise();
        eagle.makeNoise();
        salmon.makeNoise();
    
    }
}
