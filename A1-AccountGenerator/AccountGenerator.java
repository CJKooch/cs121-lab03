/**
 * User account name generator
 * @author Chay Kooch
 */
import java.util.Scanner;
import java.util.Random;

public class AccountGenerator
{
    public static void main(String[] args)
    {
       int randomSuffix; 
       String firstName, lastName, username; 
       Random generator = new Random();
       Scanner kbd = new Scanner(System.in);
       
       System.out.print("Enter your first name: ");
       firstName = kbd.nextLine();
       System.out.print("Enter your last name: ");
       lastName = kbd.nextLine();
       kbd.close();

       randomSuffix = generator.nextInt(90) + 10;
       username = firstName.charAt(0) + lastName.substring(0,5) + randomSuffix;

       System.out.println("Username: " + username.toLowerCase());
    }
}