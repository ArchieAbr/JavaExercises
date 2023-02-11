//import scanner and math for input and square root
import java.util.Scanner;
import java.lang.Math;

public class Spheroid {
    public static void main (String[] args){
        System.out.print("Please enter equatorial radius in kilometers: ");

        Scanner input1 = new Scanner(System.in);

        double a = input1.nextDouble();

        System.out.print("Please enter polar radius in kilometers: ");

        Scanner input2 = new Scanner(System.in);

        double c = input2.nextDouble();

        //variable manipulation for calcs
        double cSquared = c * c;

        double aSquared = a * a;

        //Calcs
        double eccentricity = 1 - (cSquared / aSquared);

        double eccentricitySqrt = Math.sqrt(eccentricity);

        //test
        System.out.printf("%.3f Eccentricity = ", eccentricitySqrt);


    }
}
