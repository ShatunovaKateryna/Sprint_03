package Sprint_03;
public class Population {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        int totalPopulationIn2023 = 35234980;
        int secondsInYear=365 * 24 * 60 * 60;
        int birthsPerYear=secondsInYear/17;
        int deathsPerYear=secondsInYear/7;
        int departuresPerYear=secondsInYear/45;
        for (int i=2023; i<=2028; i++){
            System.out.println("Total population for "+i+" is "+(totalPopulationIn2023+=birthsPerYear-deathsPerYear-departuresPerYear));
        }
    }
}
