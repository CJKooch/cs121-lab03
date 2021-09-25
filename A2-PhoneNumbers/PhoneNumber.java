/**
 * User account name generator
 * @author Chay Kooch
 */
import java.util.Random;

public class PhoneNumber 
{
    public static void main(String[] args)
    {
        int wow;
        Random generator = new Random(); 

        wow = generator.nextInt(90) + 10;

        System.out.println("Username: " + wow);
    }   
}
