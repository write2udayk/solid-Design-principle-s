package soliddesignprinciples;

/**
 * The {@code AngryBird} class is responsible for rendering a bird. 
 * This class follows the Single Responsibility Principle by 
 * focusing on rendering functionality only.
 */
public class AngryBird {

    /**
     * Renders the specified bird. This method simulates rendering by 
     * outputting the bird's name to the console.
     *
     * @param bird the {@code Bird} object to be rendered
     */
    public void renderBird(Bird bird) {
        System.out.println(bird.birdName + " rendered!!");
    }
}
