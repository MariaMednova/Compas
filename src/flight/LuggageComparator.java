package flight;



import java.util.Comparator;

public class LuggageComparator implements Comparator<Luggage> {

    @Override
    public int compare(Luggage o1, Luggage o2) {
        if (o1.weight > o2.weight) return 1;
        if (o1.weight < o2.weight) return -1;
        return 0;
    }
}
