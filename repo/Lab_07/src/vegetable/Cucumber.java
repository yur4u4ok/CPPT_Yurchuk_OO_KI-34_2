package vegetable;
/**
 * Class <code>Cucumber</code> extends Vegetable
 * @version 1.0
 */
public class Cucumber extends Vegetable{
    /**
     * Constructor
     * @param weight
     * @param size
     */
    public Cucumber(int weight, int size)
    {
        super(weight, size, "Green");
    }
    /**
     * Method for eating
     */
    void eat() {
        System.out.println("Eat");
    }
}
