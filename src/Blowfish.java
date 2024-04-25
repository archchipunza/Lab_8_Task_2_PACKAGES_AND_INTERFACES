public class Blowfish extends Fish {
    private boolean isPoisonous;

    public Blowfish() {
    }

    public Blowfish(String name, int age, double weight, boolean hasScales, boolean isPoisonous) {
        super(name, age, weight, String.valueOf(hasScales));
        this.isPoisonous = isPoisonous;
    }

    public Blowfish(String name, int age, boolean hasScales, boolean isPoisonous) {
        super(name, age, String.valueOf(hasScales));
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void eat() {
        System.out.println("The blowfish is eating.");
    }

    @Override
    public String getVoice() {
        return "Blub Blub";
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", has scales?=" + super.isHasScales() +
                ", is poisonous?=" + isPoisonous +
                '}';
    }
}