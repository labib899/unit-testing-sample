package math;

public class ArithmeticOperations 
{
    public double divide(double numerator, double denominator) 
    {
        if (denominator == 0) throw new ArithmeticException("Cannot divide with zero");
        return numerator / denominator;
    }

    public int multiply(int x, int y) 
    {
        if (x < 0 || y < 0) throw new IllegalArgumentException("x & y should be >= 0");
        else if (y == 0) return 0;
        else if (x <= Integer.MAX_VALUE / y) return x * y;
        else throw new IllegalArgumentException("The product does not fit in an Integer variable");
    }

}