public class StrLeng
{
    public static void main (String[] args)
    {
        String str;
        int    len;

        str = new String( "The humble penguin. A weapon of mass destruction. Who will win?" );

        len = str.length();

        System.out.println("The length is: " + len );
    }
}