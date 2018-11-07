public class CorrectChange
{
    public static void main (String[] args)
    {
        int cents = 163;
        int dollars = cents/100;
        int quarters = (cents-(dollars*100))/25;
        int dimes = (cents - (dollars*100) - (quarters*25))/10;
        int nickles = (cents - (dollars*100) - (quarters*25) - (dimes*10))/5;
        int aftercents = (cents - (dollars*100) - (quarters*25) - (dimes*10) - (nickles*5));
        System.out.println("You need "+ dollars + " " + quarters + " " + dimes + " " + nickles + " " + aftercents);

    }
}