package soliddesignprinciples;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Execution_class} demonstrates the execution of different bird-related operations.
 * It creates instances of various bird types and performs actions such as eating, flying, 
 * flapping wings, and rendering.
 */
public class Execution_class {
    /**
     * The main method that serves as the entry point of the program.
     * It creates instances of different bird types and performs various 
     * operations on them.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create instances of different bird types
        Hen hen = new Hen("hen", "white", 2.2);
        Eagle eagle = new Eagle("eagle", "Brown", 3.5);
        Penguin penguin = new Penguin("penguin", "White & Black", 8.9);

        // List to hold all birds
        List<Bird> birds = new ArrayList<Bird>();

        // Add bird instances to the list
        birds.add(hen);
        birds.add(eagle);
        birds.add(penguin);

        // Create an instance of AngryBird for rendering birds
        AngryBird ab = new AngryBird();

        // Iterate over each bird and perform various operations
        for (var bird : birds) {
            // Make the bird eat
            bird.eat();

            // Check if the bird is flyable, then perform flying action
            if (bird instanceof IFlyable) {
                ((IFlyable) bird).flyable();
            }

            // Check if the bird can flap wings, then perform wing-flapping action
            if (bird instanceof IFlapable) {
                ((IFlapable) bird).flapWings();
            }

            // Render the bird using the AngryBird instance
            ab.renderBird(bird);

            // Alternative approach using a ternary operator for flyable check
            // IFlyable flyableBird = (bird instanceof IFlyable) ? (IFlyable) bird : null;
            // if (flyableBird != null) {
            //     flyableBird.flyable();
            // }
        }
    }
}
