public class ApplianceCost
{
    public static void main (String[] args)
    {
        double cost = 8.42;
        int used = 653;
        double aftercost = (cost*used)/100.0;
        System.out.println("Cost is "+ aftercost);
    }
}