package Boat;
/**
 * Class <code>App</code>
 * @version 1.0
 */
public class App {
    /**
     * @param argc
     */
    public static void main(String[] argc)
    {
        int STEP = 1;

        Position position = new Position(0,0);
        MotorBoat motorBoat = new MotorBoat(position, STEP);

        motorBoat.inflat();
        motorBoat.launch();

        Step[] way = {
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
                new Step("LEFT"),
        };

        motorBoat.start(way);

    }
}
