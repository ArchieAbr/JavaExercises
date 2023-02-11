//import scanner and math for input and square root
import java.util.Scanner;
import java.lang.Math;

public class Spheroid {
    public static void main (String[] args){

       
        System.out.print("Please enter equatorial radius in kilometres: "); 

        Scanner input1 = new Scanner(System.in);
            
        double a = input1.nextDouble();

        while(a <= 0){

            System.out.print("Error: equatorial radius must be larger than 0: ");

            a = input1.nextDouble();

        }

        System.out.print("Please enter polar radius in kilometres: ");

        Scanner input2 = new Scanner(System.in);

        double c = input2.nextDouble();

        while(c <= 0){

            System.out.print("Error: polar radius must be larger than 0: ");

            c = input2.nextDouble();
        }

        if(c > a){

            System.out.print("Error: equatorial radius must be larger than polar radius");

            System.exit(1);
        }

        //variable manipulation for calcs
        double cSquared = c * c;

        double aSquared = a * a;

        //Calcs1
        double eccentricity = 1 - (cSquared / aSquared);

        double eccentricitySqrt = Math.sqrt(eccentricity);

        //Calcs2

        double volume = (4 * Math.PI * aSquared * c) / 3;
        
        //formatted output
        System.out.printf(" Eccentricity = %.3f\n Volume = %g cubic km ", eccentricitySqrt, volume);

    }
}