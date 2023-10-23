package Sprint_03;
public class Speed {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        //data entry
        double minutes=45.0;
        double seconds=0.30;
        int distance=14;
        double AverageSpeed;
        //Calculation
        double time=(minutes+seconds)/60;
        double DistanceInMiles=distance/1.6;
        AverageSpeed=DistanceInMiles/time;
        //Output
        System.out.println("Average speed in miles is "+AverageSpeed);
    }
}
