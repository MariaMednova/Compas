package compas_second;

import java.util.Scanner;

public class Destination {


    public static void main(String[] args) {
        compas();
    }

    public static void compas() {
        System.out.println("введите градусы:  ");
        Double degree = 0.0;
        Scanner sc = new Scanner(System.in);
        try {
            degree = sc.nextDouble();
        } catch (NumberFormatException nfe) {
            System.out.println("Введен не верный формат");
            return;
        }
        WorldParts[] worldParts = WorldParts.values();
        double b = 360.0 / 16.0;
        if (degree < 0 || degree > 360) {
            System.out.println("Введен не верный формат");
            return;
        } else {
            if ((degree > (360 - b) && degree <= 360) || (degree >= (WorldParts.NORTH.degree) && degree < (WorldParts.NORTH.degree) + b)) {
                System.out.println("Часть света NORTH");
            } else {
                for (WorldParts dest : worldParts) {
                       if ((degree > dest.degree - b) && (degree<=dest.degree + b)) {
                        System.out.printf("Часть света %s", dest);
                    }
                }
            }
        }
    }
}
