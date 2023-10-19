package Sprint_03;
import java.util.Scanner;
public class RadToGrad {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radians (like this 1,57)");
        double radians=scanner.nextDouble();
        double Pi=3.14159265;
        //Math.toDegrees(radians);
        double degrees=radians*180/Pi;
        System.out.println("Radians to degrees is "+degrees);
    }
}