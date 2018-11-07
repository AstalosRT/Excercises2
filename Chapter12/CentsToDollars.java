public class CentsToDollars
{
    public static void main (String[] args)
    {
        int cents = 684343453;
        int dollars = cents/100;
        int aftercents = cents - (dollars*100);
        System.out.println("You have "+ dollars + " dollars and "+ aftercents +" cents.");
    }
}