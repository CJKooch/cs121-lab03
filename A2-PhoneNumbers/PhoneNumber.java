/**
 * User account phone number
 * @author Chay Kooch
 */
import java.util.Random;

public class PhoneNumber 
{
    public static void main(String[] args)
    {
        int num2, num3, var1, var2, var3;
        Random rand = new Random(); 
        var1 = rand.nextInt (7) + 1;
        var2 = rand.nextInt (7) + 1;
        var3 = rand.nextInt (7) + 1;
        num2 = rand.nextInt (643) + 100;
        num3 = rand.nextInt (9000) + 1000;

        System.out.println(var1+""+var2+""+var3+"-"+num2+"-"+num3); // Prints random 10 digit phone number
    }   
}
