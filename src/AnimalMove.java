public interface AnimalMove {
    default void move() {
        System.out.println("Moving...");
    }
}