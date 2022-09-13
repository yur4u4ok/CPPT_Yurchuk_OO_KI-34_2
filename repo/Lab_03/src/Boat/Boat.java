package Boat;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.Thread;
import java.io.File;
/**
 * Class <code>Boat</code>
 * @version 1.0
 */
public class Boat
{
    boolean isLaunched = false;
    boolean isRowing = false;

    int INTERVAL = 1000;
    int STEP = 1;
    int x = 0;
    int y = 0;

    Paddle leftPaddle = new Paddle();
    Paddle rightPaddle = new Paddle();
    Body body = new Body();

    String direction = "BACK";
    PrintWriter fout;
    /**
     * Constructor
     * @throws FileNotFoundException
     */
    public Boat() throws FileNotFoundException
    {
        fout = new PrintWriter(new File("out.txt"));
    }
    /**
     * Method starts the boat
     */
    public void launch()
    {
        if(body.isInflat())
        {
            isLaunched = true;
            System.out.println("The boat is launched!");
            return;
        }

        message("The boat is not inflated!");
    }
    /**
     * Method inflats the boat
     */
    public void inflat()
    {
        body.inflat();
        message("The boat is inflated!");
    }
    /**
     * Method blows the boat
     */
    public void blow()
    {
        body.blow();
    }
    /**
     * Method stops the boat
     */
    public void stopRowing()
    {
        message("The boat is rowing!");
        isRowing = false;
    }
    /**
     * Method starts the boat
     */
    public void startRowing(Step[] way)
    {
        message("The boat is rowing!");
        isRowing = true;

        try {
            for (int i = 0; i < way.length; i++) {
                switch (way[i].direction)
                {
                    case "FORWARD":
                        y += STEP;
                        break;
                    case "BACK":
                        y -= STEP;
                        break;
                    case "LEFT":
                        x -= STEP;
                        break;
                    case "RIGHT":
                        x += STEP;
                        break;
                }
                showCords();

                if(i % 2 == 0)
                {
                    rightPaddle.use(way[i].direction);
                }else{
                    leftPaddle.use(way[i].direction);
                }

                if(!isRowing || !isLaunched || !body.isInflat()) break;
                Thread.sleep(INTERVAL);
            }
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * Method changes the boat direction
     */
    public void changeDirection(String dir)
    {
        if(dir == "FORWARD" || dir == "LEFT" || dir == "BACK" || dir == "RIGHT")
        {
            direction = dir;
            return;
        }
    }
    /**
     * X getter
     */
    public int getX()
    {
        return x;
    }
    /**
     * Y getter
     */
    public int getY()
    {
        return y;
    }
    /**
     * Change boat direction
     */
    public void goTo(int posX, int posY)
    {
        x = posX;
        y = posY;
    }
    /**
     * Move the boat to start position
     */
    public void goToStart()
    {
        x = 0;
        y = 0;
    }
    /**
     * Method prints the boat direction
     */
    private void showDirection()
    {
        message("The boat is rowing " + direction);
    }
    private void showCords()
    {
        message("x: " + x + "\n" + "y: " + y);
    }
    private void message(String msg)
    {
        System.out.println(msg);
        fout.println(msg);
    }
}
