public class Cone
{
    private double height;
    private double radius;

    public Cone(double radius, double height)
    {

    }

    public double area()
    {
        area = (Math.PI)*(radius)*((radius) + Math.sqrt((height*height)+(radius+radius)));
    }
    public double volume()
    {
        volume = (Math.PI)*(radius*radius)*(height/3);
    }
    public void setHeight()
    {
        height = height;
    }
    public void setRadius()
    {
        radius = radius;
    }
    public double getHeight()
    {
        return height;
    }
    public double getRadius()
    {
        return radius;
    }
}