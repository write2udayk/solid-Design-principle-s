package soliddesignprinciples;

/**
 * The {@code IFlapable} interface defines a contract for objects that can flap their wings.
 * Any class that implements this interface must provide an implementation for the 
 * {@code flapWings} method, specifying how the object flaps its wings.
 */
public interface IFlapable {
    
    /**
     * Flaps the wings of the implementing object.
     * This method should define the behavior of wing flapping for the specific object.
     */
    public void flapWings();
}
