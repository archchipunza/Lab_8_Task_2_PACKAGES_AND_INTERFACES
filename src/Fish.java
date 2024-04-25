public abstract class Fish extends Animal implements AnimalBehavior, AnimalMove, AnimalName {
    protected boolean hasScales;
    private String scaleColor;

    public Fish() {
        super(); // Call the superclass constructor without passing 'name' and 'age'
    }

    public Fish(String name, int age, double weight, boolean hasScales, String scaleColor) {
        super(name, age, weight); // Call the superclass constructor with 'name', 'age', and 'weight'
        this.hasScales = hasScales;
        this.scaleColor = scaleColor;
    }

    public Fish(String name, int age, boolean hasScales, String scaleColor) {
        super(); // Call the superclass constructor with 'name' and 'age'
        this.hasScales = hasScales;
        this.scaleColor = scaleColor;
    }

    public Fish(String name, int age, double weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, int age, String scaleColor) {
        super();
        this.scaleColor = scaleColor;
    }

    public Fish(String name, int age) {
        super();
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating.");
    }

    @Override
    public String getVoice() {
        return "Bubbles";
    }

    public boolean hasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void sleep() {
        System.out.println("The fish is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("The fish is swimming.");
    }

    @Override
    public String name() {
        return getName();
    }

    protected String isHasScales() {
        return null;
    }
}