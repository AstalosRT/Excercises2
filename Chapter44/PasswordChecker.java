import java.util.Scanner;

public class PasswordChecker
{
    public static void main(String[] args)
    {
        Scanner ligma = new Scanner(System.in);

        System.out.println("Enter your password");
        String str = ligma.nextLine();
        if (str.length() < 7)
        {
            System.out.println("Your password is too weak.");
        }
        else
        {
            System.out.println("Your password is good.");
        }

    }

    
}