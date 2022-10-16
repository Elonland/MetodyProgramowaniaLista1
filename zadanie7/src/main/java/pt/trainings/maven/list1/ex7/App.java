package pt.trainings.maven.list1.ex7;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "I am going to calculate 2 * 2\n" );
        int x,y;
        x = 2;
        y = 2;
        Calculate calc = new Calculate();
        calc.multiply(x, y);
    }
}
