abstract class shape
{
    abstract void numberofsides();
}

class rectangle extends shape
{
    void numberofsides()
    {
        System.out.println("Number of sides of rectangle is 4");
    }
}

class triangle extends shape
{
    void numberofsides()
    {
        System.out.println("Number of sides of triangle is 3");
    }
}

class hexagon extends shape
{
    void numberofsides()
    {
        System.out.println("Number of sides of hexagon is 6");
    }
}

public class abstract_ {
    public static void main(String args[])
    {
        rectangle r=new rectangle();
        r.numberofsides();

        triangle t= new triangle();
        t.numberofsides();

        hexagon h= new hexagon();
        h.numberofsides();
    }
    
}
