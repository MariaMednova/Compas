package bus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer[]> stops = new ArrayList<>();
        Integer [] stop1 = {30,0};

        Integer [] stop2 = {10,15};
        Integer [] stop3 = {0,25};
        stops.add(stop1);
        stops.add(stop2);
        stops.add(stop3);
        Integer quantity = stops.stream()
                .map(stop -> stop[0] - stop[1])
                .limit(stops.size() -1 )
                .reduce(0, Integer::sum);
        System.out.println(quantity);
        stops.stream().forEach(s -> System.out.println(s));
    }

}
