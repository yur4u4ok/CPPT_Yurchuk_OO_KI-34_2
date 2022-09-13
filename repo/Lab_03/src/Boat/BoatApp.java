package Boat;
/**
 * Class <code>BoatApp</code>
 * @version 1.0
 */
public class BoatApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            Step[] way = {
                    new Step("RIGHT"),
                    new Step("RIGHT"),
                    new Step("RIGHT"),
                    new Step("LEFT")
            };

            Boat boat = new Boat();

            boat.inflat();
            boat.launch();
            boat.startRowing(way);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
