package Boat;
import java.lang.Thread;
/**
 * Class <code>Boat</code>
 * @version 1.0
 */
public abstract class Boat {

    protected int step;
    protected Position position;

    protected boolean isInflated = true;
    protected boolean isLaunched = true;

    abstract void start(Step[] way);
    /**
     * Constructor
     * @param pos
     * @param step
     */
    public Boat(Position pos, int step)
    {
        this.position = pos;
        this.step = step;
    }
    /**
     * Method inflats the boat
     */
    public void inflat()
    {
        isInflated = true;
        System.out.println("The boat is inflated!");
    }
    /**
     * Method blows the boat
     */
    public void blow()
    {
        isInflated = false;
    }
    /**
     * Method launchs the boat
     */
    public void launch()
    {
        if(isInflated)
        {
            isLaunched = true;
            System.out.println("The boat is launched!");
            return;
        }

        System.out.println("The boat is not inflated!");
    }
    protected void moveTo(Step s)
    {
        try {
            switch (s.direction)
            {
                case "FORWARD":
                    position.y += step;
                    break;
                case "BACK":
                    position.y -= step;
                    break;
                case "LEFT":
                    position.x -= step;
                    break;
                case "RIGHT":
                    position.x += step;
                    break;
                default:
                    System.out.println("Incorrect direction");
            }
            Thread.sleep(s.SLEEP);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }


}
