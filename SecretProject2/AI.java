import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class AI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AI
{
    /** description of instance variable x (add comment for each instance variable) */
    private String voice;
    private List<String> list = new ArrayList<String>();
    /**
     * Default constructor for objects of class AI
     */
    public AI()
    {
        voice = "";
    }

    public String response(int input)
    {
        String answer = "";
        
        return answer;
    }
    
    public void memory(String in)
    {
        this.list.add(in);
    }
}
