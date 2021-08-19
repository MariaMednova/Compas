package Pef_lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compas {
    public static void main(String[] args) {
        compas();
    }
    public static void compas() {
        System.out.println("введите градусы:  ");
        Double degree= 0.0;
        Scanner sc = new Scanner(System.in);
    try {
            degree = sc.nextDouble();}
    catch (NumberFormatException nfe){
                System.out.println("Введен не верный формат");
                return;
    }
        System.out.println(degree);
    }


}
