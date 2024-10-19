package soliddesignprinciples;

/**
 * The {@code IFlyable} interface defines a contract for objects that can fly.
 * Any class that implements this interface must provide an implementation for the 
 * {@code flyable} method, specifying how the object behaves when it flies.
 */
public interface IFlyable {

    /**
     * Executes the flying behavior of the implementing object.
     * This method should define how the specific object flies.
     */
    public void flyable();
}
