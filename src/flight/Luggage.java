package flight;

public class Luggage  {
    public String companyName;
    public String flightClass;
    public int weight;

    public Luggage(String companyName, String flightClass, int weight) {
        this.companyName = companyName;
        this.flightClass = flightClass;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "companyName='" + companyName + '\'' +
                ", flightClass='" + flightClass + '\'' +
                ", weight=" + weight +
                '}';
    }



}
