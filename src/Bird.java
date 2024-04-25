public abstract class Bird extends Animal implements AnimalBehavior, AnimalMove, AnimalName {
    protected boolean canFly;
    private String featherColor;

    public Bird() {
        super();
    }

    public Bird(String name, int age, double weight, boolean canFly, String featherColor) {
        super(name, age, weight);
        this.canFly = canFly;
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, boolean canFly, String featherColor) {
        super();
        this.canFly = canFly;
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, String featherColor) {
        super();
        this.featherColor = featherColor;
    }

    public Bird(String name, int age) {
        super();
    }

    @Override
    public void eat() {
        System.out.println("The bird is eating.");
    }

    @Override
    public String getVoice() {
        return "Chirps";
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void sleep() {
        System.out.println("The bird is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("The bird is flying.");
    }

    @Override
    public String name() {
        return getName();
    }
}