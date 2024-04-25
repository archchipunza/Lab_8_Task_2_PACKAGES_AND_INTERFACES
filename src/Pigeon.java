public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
    }

    public Pigeon(String name, int age, double weight, boolean canFly, String species) {
        super(name, age, weight, String.valueOf(canFly));
        this.species = species;
    }

    public Pigeon(String name, int age, boolean canFly, String species) {
        super(name, age, String.valueOf(canFly));
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("The pigeon is eating.");
    }

    @Override
    public String getVoice() {
        return "Coos";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", can fly?=" + super.canFly() +
                ", species='" +species + '\'' +
                '}';
    }
}