public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    private String breed;

    public Dog() {
        super();
        this.breed = "";
    }

    public Dog(String name, int age, double weight, boolean hasFur, String breed) {
        super(name, age, weight, String.valueOf(hasFur));
        this.breed = breed;
    }

    public Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, String.valueOf(hasFur));
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("The dog is feasting.");
    }

    @Override
    public String getVoice() {
        return "Barks";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void play() {
        System.out.println("The dog is playing.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", has fur?=" + super.isHasFur() +
                ", breed='" + breed + '\'' +
                '}';
    }
}