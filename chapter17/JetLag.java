import java.util.scanner;

public class JetLag 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many time zones are you changing?");
        int zones = (scan.nextInt()-1);
        System.out.println("What time did you depart in 24 hour time, rounded to the nearest hour?");
        int departent = scan.nextInt();
        int depart = 0;
        if (departent > 8 && departent <= 12)
        {
            depart = 0;
        }
        else if (departent > 12 && departent <= 18)
        {
            depart = 1;
        }
        else if (departent > 18 && departent <= 22)
        {
            depart = 3;
        }
        else if (departent > 22 || departent <= 1);
        {
            depart = 4;
        }
        else
        {
            depart = 5;
        }

        System.out.println("What time did you arrive in 24 hour time, rounded to the nearest hour?");
        int arrivent = scan.nextInt();
        int arrive = 0;
        if (arrivent > 8 && arrivent <= 12)
        {
            arrive = 4;
        }
        else if (arrivent > 12 && arrivent >= 18)
        {
            arrive = 2;
        }
        else if (arrivent > 18 && arrivent >= 22)
        {
            arrive = 0;
        }
        int hours = depart - arrive + zones;
        int recovery = ((hours*0.5)+(zones-3)+depart+arrive)*0.1;
        System.out.println("You need " + recovery + " days to recover" + hours);
    }
}