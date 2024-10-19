package soliddesignprinciples;

/**
 * The {@code Hen} class represents a specific type of bird, a hen.
 * It extends the abstract {@code Bird} class and implements the 
 * {@code IFlyable} and {@code IFlapable} interfaces, allowing it to 
 * perform actions related to flying and flapping wings.
 */
public class Hen extends Bird implements IFlyable, IFlapable {

    /**
     * Constructs a new {@code Hen} with the specified name, color, and weight.
     *
     * @param birdName the name of the hen
     * @param color    the color of the hen
     * @param weight   the weight of the hen in kilograms
     */
    public Hen(String birdName, String color, double weight) {
        super(birdName, color, weight);
    }

    /**
     * Specifies the eating behavior of the hen.
     * This implementation indicates that the hen will eat small grains.
     */
    @Override
    public void eat() {
        System.out.println("Hen " + this.birdName + " will eat small grains");
    }

    /**
     * Describes the flying behavior of the hen.
     * This implementation indicates that the hen will fly low.
     */
    @Override
    public void flyable() {
        System.out.println("Hen " + this.birdName + " will fly low");
    }

    /**
     * Describes the wing-flapping behavior of the hen.
     * This implementation indicates that the hen will flap its wings.
     */
    @Override
    public void flapWings() {
        System.out.println("Hen " + this.birdName + " will flap wings");
    }
}
