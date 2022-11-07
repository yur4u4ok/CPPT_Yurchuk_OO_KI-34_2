import vegetable.*;
/**
 * Class <code>App</code>
 * @version 1.0
 */
public class App
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        try{
            Jar cucumberJar = new Jar();
            Jar tomatoJar = new Jar();

            cucumberJar.put(new Cucumber(1, 10));
            cucumberJar.put(new Cucumber(2, 10));
            cucumberJar.put(new Cucumber(3, 10));

            tomatoJar.put(new Tomato(12,5));
            tomatoJar.put(new Tomato(123,123));

            System.out.println("Cucumbers: ");
            cucumberJar.show();
            System.out.println("Tomatoes: ");
            tomatoJar.show();
            cucumberJar.shake();
            System.out.println("Cucumbers: ");
            cucumberJar.show();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
