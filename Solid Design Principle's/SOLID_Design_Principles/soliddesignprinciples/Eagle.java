package soliddesignprinciples;

/**
 * The {@code Eagle} class represents a specific type of bird, an eagle.
 * It extends the abstract {@code Bird} class and implements the 
 * {@code IFlyable} and {@code IFlapable} interfaces, allowing it to 
 * perform actions related to flying and flapping wings.
 */
public class Eagle extends Bird implements IFlyable, IFlapable {

    /**
     * Constructs a new {@code Eagle} with the specified name, color, and weight.
     *
     * @param birdName the name of the eagle
     * @param color    the color of the eagle
     * @param weight   the weight of the eagle in kilograms
     */
    public Eagle(String birdName, String color, double weight) {
        super(birdName, color, weight);
    }

    /**
     * Specifies the eating behavior of the eagle.
     * This implementation indicates that the eagle will eat fish.
     */
    @Override
    public void eat() {
        System.out.println("Eagle " + this.birdName + " will eat fish");
    }

    /**
     * Describes the flying behavior of the eagle.
     * This implementation indicates that the eagle can fly high.
     */
    @Override
    public void flyable() {
        System.out.println("Eagle " + this.birdName + " will fly high");
    }

    /**
     * Describes the wing-flapping behavior of the eagle.
     * This implementation indicates that the eagle flaps its wings high.
     */
    @Override
    public void flapWings() {
        System.out.println("Eagle " + this.birdName + " is flapping its wings high");
    }
}
