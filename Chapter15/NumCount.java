import java.util.Scanner;

public class NumCount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the starting number?");
        int start = scan.nextInt();
        System.out.println("What is the ending number?");
        int end = scan.nextInt();

        while (start <= end)
        {
            System.out.println(start);
            start = (start + start);
        }
        System.out.println("Done!");
    }
}