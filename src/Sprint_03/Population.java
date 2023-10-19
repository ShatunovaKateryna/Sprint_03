package Sprint_03;
public class Population {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        Display();
    }
    private static int totalPopulationIn2023 = 35234980;
    private static final int secondsInYear=365 * 24 * 60 * 60;
    private static final int birthsPerYear=secondsInYear/17;
    private static final int deathsPerYear=secondsInYear/7;
    private static final int departuresPerYear=secondsInYear/45;
    public static void Display(){
        for (int i=2023; i<=2028; i++){
            System.out.println("Total population for "+i+" is "+(totalPopulationIn2023+=birthsPerYear-deathsPerYear-departuresPerYear));
        }
    }
}
