import java.util.Scanner;

public class Dump
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much trash do you need to dump!");
        int twents = scan.nextInt() / 200;
        int eights = twents / 100;
        System.out.println("Your price is " + ((twents*20)+eights*8) + "!");

    }
}