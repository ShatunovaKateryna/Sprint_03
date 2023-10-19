package Sprint_03;
import java.util.Scanner;
public class GradToRad {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degrees");
        double degrees=scanner.nextDouble();
        double PI=3.14159265;
        //Math.toRadians(degrees);
        double radians=degrees*PI/180;
        System.out.println("Degrees to radians is "+radians);
    }
}
