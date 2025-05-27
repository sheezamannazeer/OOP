import java.util.*;

class exception_handling {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter diviser");
            int a=sc.nextInt();
            System.out.println("Enter dividend");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("Result"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occured");
        }
        finally
        {
            System.out.println("End of operation");
            System.out.println("******************************");
        }
    }
    
}