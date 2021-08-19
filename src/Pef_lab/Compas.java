package Pef_lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compas {
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
        if ((degree <= WorldPart.NORTH.degree && degree > (WorldPart.NORTH.degree + 45)) || degree == 0.0) {
            System.out.printf("Часть света %s", WorldPart.NORTH.partWorld);
        } else if (degree >= WorldPart.NW.degree && degree < (WorldPart.NW.degree + 45)) {
            System.out.printf("Часть света %s", WorldPart.NW.partWorld);
        } else if (degree >= WorldPart.WEST.degree && degree < (WorldPart.WEST.degree + 45)) {
            System.out.printf("Часть света %s", WorldPart.WEST.partWorld);
        } else if (degree >= WorldPart.SW.degree && degree < (WorldPart.SW.degree + 45)) {
            System.out.printf("Часть света %s", WorldPart.SW.partWorld);
        } else if (degree >= WorldPart.SOUTH.degree && degree < (WorldPart.SOUTH.degree + 45)) {
            System.out.printf("Часть света %s", WorldPart.SOUTH.partWorld);
        } else if (degree >= WorldPart.SE.degree && degree < (WorldPart.SE.degree + 45)) {
            System.out.printf("Часть света %s", WorldPart.SE.partWorld);
        } else if (degree >= WorldPart.EAST.degree && degree < (WorldPart.EAST.degree + 45)) {
            System.out.printf("Часть света %s", WorldPart.EAST.partWorld);
        } else if (degree >= WorldPart.NE.degree && degree < (WorldPart.NE.degree + 45)) {
            System.out.printf("Часть света %s", WorldPart.NE.partWorld);
        }

    }
}
