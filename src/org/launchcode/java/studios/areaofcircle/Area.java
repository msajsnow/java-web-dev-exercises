package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        float num_input = Float.parseFloat(input);
        float answer = (float) (num_input * num_input * Math.PI);
        System.out.println(answer);

    }


}
