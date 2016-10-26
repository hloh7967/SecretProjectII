
import java.util.Random;
/**
 * Write a description of class deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class deck
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cards;

    /**
     * Default constructor for objects of class deck
     */
    public deck()
    {

        cards = 52;
    }


    public String deal()
    {
        Random s = new Random();
        int value = s.nextInt(12) + 1;
    }

}
