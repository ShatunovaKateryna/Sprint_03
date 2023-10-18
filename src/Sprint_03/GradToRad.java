package Sprint_03;

import java.util.Scanner;

public class GradToRad {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degrees");
        double degrees=scanner.nextDouble();
        double radians=Math.toRadians(degrees);
        System.out.println("Degrees to radians is "+radians);
    }
}
