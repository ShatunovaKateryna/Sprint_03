package Sprint_03;

import java.util.Scanner;

public class RadToGrad {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radians");
        double radians=scanner.nextDouble();
        double degrees=Math.toDegrees(radians);
        System.out.println("Radians to degrees is "+degrees);
    }
}