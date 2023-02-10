import java.util.Scanner;

public class Weight {
    public static void main(String[] args){
        //program goes here
        System.out.print("Please enter weight in kilograms: ");
        
        Scanner input = new Scanner(System.in);

        double weightKilos = input.nextDouble();

        double weightPoundsTemp = weightKilos * (2.205/1.0);

        double weightOunces = weightPoundsTemp % 1 * 16;

        int weightPounds = (int) weightPoundsTemp;

        System.out.printf("%.1f kg = %s Ibs %.1f oz \n",
            weightKilos, weightPounds, weightOunces);

    }
}
