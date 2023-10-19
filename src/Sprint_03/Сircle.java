package Sprint_03;
public class Сircle {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        //data entry
        double radius, area, perimeter;
        double PI=3.14159265;
        radius=5.5;
        //calculation
        perimeter=2*radius*PI;
        area=radius*radius*PI;
        //output
        System.out.println("The area for the circle of radius "+radius+" is "+area+" and perimeter is "+perimeter);
    }
}
