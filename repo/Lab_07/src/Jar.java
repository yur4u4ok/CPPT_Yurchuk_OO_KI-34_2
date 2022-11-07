import vegetable.Vegetable;

import java.util.*;
/**
 * Class <code>Jar</code>
 * @version 1.0
 */
public class Jar <T extends Vegetable>{

    ArrayList<T> storage = new ArrayList<>();
    /**
     * Method getting an item
     */
    public T get(int index)
    {
        try{
            return storage.get(index);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method putting an item
     */
    public void put(T item)
    {
        try {
            storage.add(item);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method printing the storage
     */
    public void show()
    {
        for(int i = 0; i < storage.size(); i++)
        {
            try{
                System.out.println("Index: " + i);
                System.out.println("Size: " + storage.get(i).size);
                System.out.println("Weight: " + storage.get(i).weight);
                System.out.println("=====================");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    /**
     * Method getting item with the lowest weight
     */
    public T getMinItem()
    {
        int minIdx = 0;
        for(int i = 0; i < storage.size(); i++)
        {
            if(i == 0) continue;
            if(storage.get(i).weight < storage.get(minIdx).weight)
            {
                minIdx = i;
            }
        }
        return storage.get(minIdx);
    }
    /**
     * Method for shaking storage
     */
    public void shake()
    {
        Collections.shuffle(storage);
    }

}
