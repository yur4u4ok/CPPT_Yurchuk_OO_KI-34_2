package Boat;
/**
 * Class <code>Body</code>
 * @version 1.0
 */
public class Body {

    private boolean isInflat = false;
    /**
     * Inflat the boat
     */
    public void inflat()
    {
        isInflat = true;
    }
    /**
     * Blow the boat
     */
    public void blow()
    {
        isInflat = false;
    }
    /**
     * Method return the boat status
     */
    public boolean isInflat()
    {
        return isInflat;
    }
}
