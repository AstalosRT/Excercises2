import java.util.Scanner;

public class IntAdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int firint = 1;
        int secint = 1;
        int trint = 1;
        int quaint = 1;
        int quiint = 1;
        int finnum = 1;
        System.out.println("Enter first integer (Enter 0 to quit)");
        firint = scan.nextInt();
        if (firint == 0)
        {
            System.out.println("bye.");
        }
        secint = scan.nextInt();
        if (secint == 0)
        {
            finnum = firint;
        }
        trint = scan.nextInt();
        if (trint == 0)
        {
            finnum = firint + secint;
        }
        quaint = scan.nextInt();
        if (quaint == 0)
        {

        }
        
    }
}