public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Bhoki", 6, 20.5, true, "Labrador");
        animals[1] = new Blowfish("Nemo", 2, 1.2, true, true);
        double weight;
        animals[2] = new Pigeon("Ratatouille", 3, weight = 0.5, true, "Rock Dove");

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            System.out.println("Sound: " + animal.getVoice());
            if (animal instanceof AnimalBehavior animalBehavior) {
                animalBehavior.sleep();
            }
            if (animal instanceof AnimalMove animalMove) {
                animalMove.move();
            }
            if (animal instanceof AnimalName animalName) {
                System.out.println("Name: " + animalName.getName());
            }
            System.out.println();
        }
    }
}