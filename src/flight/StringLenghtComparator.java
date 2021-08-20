package flight;

import java.util.Comparator;

public class StringLenghtComparator implements Comparator<Luggage> {
    @Override
    public int compare(Luggage o1, Luggage o2) {
        if ((o1.companyName.concat(o1.flightClass).length()> (o2.companyName.concat(o2.flightClass)).length())) return 1;
        if ((o1.companyName.concat(o1.flightClass).length() < (o2.companyName.concat(o2.flightClass)).length())) return -1;
        return 0;
    }
}
