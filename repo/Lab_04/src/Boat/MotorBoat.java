package Boat;

interface IMotorBoat
{
    void start(Step[] way);
    void dropAnchor();
    void raiseAnchor();
}
/**
 * Class <code>MotorBoat</code> extends Boat and implements IMotorBoat
 * @version 1.0
 */
public class MotorBoat extends Boat implements IMotorBoat {

    boolean isAnchorDroped = false;
    /**
     * Constructor
     * @param position
     * @param step
     */
    public MotorBoat(Position position, int step) {
        super(position, step);
    }
    /**
     * Method for starting
     */
    public void start(Step[] way) {
        if(isAnchorDroped)
        {
            System.out.println("Cannot start");
            return;
        }
        for (int i = 0; i < way.length; i++) {
            showCoords();
            moveTo(way[i]);
        }
    }
    /**
     * Method prints the position
     */
    private void showCoords() {
        System.out.println("X: " + position.x + " Y: " + position.y);
    }
    /**
     * Method drops an anchor
     */
    public void dropAnchor()
    {
        if(isAnchorDroped)
        {
            return;
        }
        isAnchorDroped = true;
    }
    /**
     * Method raises an anchor
     */
    public void raiseAnchor()
    {
        if(isAnchorDroped)
        {
            isAnchorDroped = false;
            return;
        }
    }
}
