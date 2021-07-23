package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListPracticeNum {
    Scanner input = new Scanner(System.in);

    public static int sumEven(ArrayList<Integer> myAscending) {

//    public static int sumEven(ArrayList<Integer> ascending) {
        int total = 0;
        for (int ascending : myAscending) {
            if (ascending % 2 == 0) {
                total += ascending;
            }
//            return total;
        }

        return total;
    }
}

