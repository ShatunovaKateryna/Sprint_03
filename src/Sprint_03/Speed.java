package Sprint_03;

public class Speed {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        //data entry
        double minutes=45.0/60.0;
        double seconds=0.30/60;
        double time=minutes+seconds;

        int distance=14;
        double DistanceInMiles=14/1.6;
        double AverageSpeed;
        //calculation
        AverageSpeed=DistanceInMiles/time;

        //Display !!!
        System.out.println("Average speed in miles is "+AverageSpeed);
    }
}
