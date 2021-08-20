package flight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Flight {
    public static void main(String[] args) {
        List<Luggage> list = new ArrayList<>();

        list.add(new Luggage("RedWings", "Business", 50));
        list.add(new Luggage("Aeroflot", "Economy", 20));
        list.add(new Luggage("S7", "Economy", 15));
        list.add(new Luggage("Pobeda", "Economy", 5));
        list.add(new Luggage("Aeroflot", "First", 25));
        list.add(new Luggage("Aeroflot", "Business", 60));
        list.add(new Luggage("S7", "Business", 50));

        Comparator<Luggage> pc = new LuggageComparator();

        pc = new Comparator<Luggage>() {
            @Override
            public int compare(Luggage o1, Luggage o2) {
                return o1.weight - o2.weight;
            }
        };
       pc.compare(list.get(0),list.get(1));

        list.sort(pc);


        System.out.println(list);
        }
    }

