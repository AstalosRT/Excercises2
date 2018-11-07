import java.util.Scanner;

public class SheepHerd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many years for the sheeps for breed?");
        double sheeps = 20;
        double y = scan.nextInt();
        double power = Math.pow(0.83, y);
        double aftersheeps = 220/(1+10*power);
        double years = 0;
        while(years >= y)
        {
            power = Math.pow(0.83, y);
            aftersheeps = 220/(1+10*power);
            System.out.println("Year "+ y +" has "+ aftersheeps +" lil sheeps.");
            years = years + 1;
        }
    }
}