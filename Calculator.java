
/**
 * Write a description of class function here.
 *
 * @author (Chauncey)
 * @version (9/29/2021)
 */
public class Calculator
{
   
    /**
     * Constructor for objects of class function
     */
   

    public Calculator()
    {
        
        
    }
    public double[] quadfermolafivehead(double a, double b, double c)
    {
        double x,y;
        // initialise instance variables
        x = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        y = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        double[] z = {x,y};
        return z;
    }
     public double slopefermolaPagMan(double x1, double y1, double x2, double y2)
    {
        // initialise instance variables
        double x;
        x = (y2-y1)/(x2-x1);
        return x;
    }
     public double[] midpointcatJAM(double x1, double y1, double x2, double y2)
    {
        // initialise instance variables
        double x,y;
        x = (x1+x2)/2;
        y = (y1+y2)/2;
        double[] z = {x,y};
        return z;
    }
    public double arithmeticOMEGALUL(double a1, double b, int terms)
    {
        // initialise instance variables
        double x=0;
        double temp=0;
        for(int count=terms; count>0; count--){
            temp = temp + b ;
        x = x + temp;
    }
        return x;
    }
    public double finitegeometricFeelsStrongMan(double a1, double commonratio, int terms)
    {
        // initialise instance variables
        double x=0;
        x= a1*((1-Math.pow(commonratio, terms))/(1-commonratio));
        return x;
    }
    public void display(){
        // Quadratic Formula
        //leading coefficient
        double a=1;
        //middle coefficient
        double b=5;
        //rightmost coefficient
        double c=6;
        double[] arr = quadfermolafivehead(a, b, c);
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + arr[1] + " and " + arr[0] + ".");
        System.out.println();
        //Slope and Midpoint Formula
        //x value of first point
        double x1=0;
        //y value of first point
        double y1=0; 
        //x value of second point
        double x2=2;
        //y value of second point
        double y2=3;
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") has a slope of " + slopefermolaPagMan(x1, y1, x2, y2));
        
         System.out.println();
        System.out.println("MIDPOINT FORMULA");
        
        arr = midpointcatJAM(x1, y1, x2, y2);
        System.out.println("The midpoint between (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") is (" + arr[0] + ", " + arr[1] + ")");
        //Sum of Arithmetic Series
        //starting value
        double a1=1.0;
        //increase amount
        double d=1.0;
        //number of terms to be calculated
        int terms=5;
        System.out.println();
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + terms + " terms of an arithmetic series that starts with " + a1);
        System.out.println("and increases by " + d + " is " + arithmeticOMEGALUL(a1, d, terms) + ".");
        //Sum of Finite Geometric Series
        //starting value
        a1=3.0;
        //commonratio
        double commonratio=2.0;
        //number of terms
        terms=3;
        System.out.println();
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + terms + " terms of a finite geometric series that starts with " + a1);
        System.out.println("and increases by a rate of " + commonratio + " is " + finitegeometricFeelsStrongMan(a1, commonratio, terms) + ".");
    }
}
