package soliddesignprinciples;

/**
 * The {@code Penguin} class represents a specific type of bird, a penguin.
 * It extends the abstract {@code Bird} class, inheriting its properties and behaviors,
 * and provides its own implementation of the {@code eat} method.
 */
public class Penguin extends Bird {

    /**
     * Constructs a new {@code Penguin} with the specified name, color, and weight.
     *
     * @param birdName the name of the penguin
     * @param color    the color of the penguin
     * @param weight   the weight of the penguin in kilograms
     */
    public Penguin(String birdName, String color, double weight) {
        super(birdName, color, weight);
    }

    /**
     * Specifies the eating behavior of the penguin.
     * This implementation indicates that the penguin will eat fish.
     */
    @Override
    public void eat() {
        System.out.println("Penguin " + this.birdName + " will eat fish!");
    }
}
