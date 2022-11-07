package vegetable;
/**
 * Class <code>Vegetable</code>
 * @version 1.0
 */
public abstract class Vegetable {
    public int size;
    public int weight;
    public String color;
    /**
     * Constructor
     * @param weight
     * @param size
     * @param color
     */
    Vegetable(int size, int weight, String color)
    {
        this.size = size;
        this.weight =  weight;
        this.color = color;
    }

    abstract void eat();
}
