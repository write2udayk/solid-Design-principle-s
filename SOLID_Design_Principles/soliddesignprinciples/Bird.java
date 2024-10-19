package soliddesignprinciples;

/**
 * The {@code Bird} class represents a general concept of a bird.
 * It serves as an abstract base class for specific types of birds.
 * This class follows the SOLID design principles, promoting the 
 * Single Responsibility Principle by keeping bird-related properties 
 * and behaviors in a single place.
 */
public abstract class Bird {
    /** The name of the bird. */
    String birdName;

    /** The color of the bird. */
    String color;

    /** The weight of the bird in kilograms. */
    double weight;

    /**
     * Constructs a new {@code Bird} with the specified name, color, and weight.
     *
     * @param birdName the name of the bird
     * @param color    the color of the bird
     * @param weight   the weight of the bird in kilograms
     */
    public Bird(String birdName, String color, double weight) {
        this.birdName = birdName;
        this.color = color;
        this.weight = weight;
    }

    /**
     * Represents the action of the bird eating. Specific bird types 
     * should provide their own implementation of this method.
     */
    public abstract void eat();
}
