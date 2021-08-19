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
        double b = 360/16;
        if (degree<0){
            System.out.println("Введен не верный формат");return;
        } else {
            if ((degree >= WorldPart.NORTH.degree - b && degree <= (WorldPart.NORTH.degree)) || (degree >= 0.0 && degree <= b)) {
                System.out.printf("Часть света %s", WorldPart.NORTH.partWorld);
            } else if (degree >= WorldPart.NW.degree - b && degree < (WorldPart.NW.degree + b)) {
                System.out.printf("Часть света %s", WorldPart.NW.partWorld);
            } else if (degree >= WorldPart.WEST.degree - b && degree < (WorldPart.WEST.degree + b)) {
                System.out.printf("Часть света %s", WorldPart.WEST.partWorld);
            } else if (degree >= WorldPart.SW.degree - b && degree < (WorldPart.SW.degree + b)) {
                System.out.printf("Часть света %s", WorldPart.SW.partWorld);
            } else if (degree <= WorldPart.SOUTH.degree + b && degree > (WorldPart.SOUTH.degree - b)) {
                System.out.printf("Часть света %s", WorldPart.SOUTH.partWorld);
            } else if (degree <= WorldPart.SE.degree + b && degree > (WorldPart.SE.degree - b)) {
                System.out.printf("Часть света %s", WorldPart.SE.partWorld);
            } else if (degree <= WorldPart.EAST.degree + b && degree > (WorldPart.EAST.degree - b)) {
                System.out.printf("Часть света %s", WorldPart.EAST.partWorld);
            } else if (degree <= WorldPart.NE.degree + b && degree > (WorldPart.NE.degree - b)) {
                System.out.printf("Часть света %s", WorldPart.NE.partWorld);
            }
        }
    }
}
