import java.util.Scanner;

public class Weight {
    public static void main(String[] args){
        //program goes here
        System.out.print("Please enter weight in kilograms: ");
        
        Scanner input = new Scanner(System.in);

        double weightKilos = input.nextDouble();

        double weightPounds = weightKilos * (2.205/1.0);

        System.out.printf("%.1f kg = %1f Ibs\n",
            weightKilos, weightPounds);

    }
}
