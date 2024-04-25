public abstract class Mammal extends Animal implements AnimalBehavior, AnimalMove, AnimalName {
    protected boolean hasFur;
    private String furColor;

    public Mammal() {
        super();
    }

    public Mammal(String name, int age, double weight, boolean hasFur, String furColor) {
        super(name, age, weight);
        this.hasFur = hasFur;
        this.furColor = furColor;
    }

    public Mammal(String name, int age, boolean hasFur, String furColor) {
        super();
        this.hasFur = hasFur;
        this.furColor = furColor;
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, int age, String furColor) {
        super();
        this.furColor = furColor;
    }

    public Mammal(String name, int age) {
        super();
    }

    @Override
    public void eat() {
        System.out.println("The mammal is eating.");
    }

    @Override
    public String getVoice() {
        return "Grunts";
    }

    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void sleep() {
        System.out.println("The mammal is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("The mammal is running.");
    }

    @Override
    public String name() {
        return getName();
    }
}