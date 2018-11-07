public class Example
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked = 80;    
    double payRate     = 275.0, taxRate = 750;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}