package vegetable;
/**
 * Class <code>Tomato</code> extends Vegetable
 * @version 1.0
 */
public class Tomato extends Vegetable{
    /**
     * Tomato
     * @param weight
     * @param size
     */
    public Tomato(int size, int weight)
    {
        super(size, weight, "Red");
    }
    /**
     * Method for eating
     */
    void eat()
    {
        System.out.println("Eat");
    }
}
