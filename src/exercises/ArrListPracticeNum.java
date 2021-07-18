package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListPracticeNum {
    Scanner input = new Scanner(System.in);

    public static int sumEven(ArrayList<Integer> ascending) {

        ArrayList<Number> myAscending = new ArrayList<>();
        ascending.add(0);
        ascending.add(1);
        ascending.add(2);
        ascending.add(3);


//    public static int sumEven(ArrayList<Integer> ascending) {
        int total = 0;
        for (Number myAscending : ascending) {
            if (myAscending % 2 == 0) {
                total += myAscending;
            }
            return total;
        }

        return total;
    }
}
//    public static void main(String[] args) {
//        ArrayList<Number> ascending = new ArrayList<>();
//        ascending.add(0);
//        ascending.add(1);
//        ascending.add(2);
//        ascending.add(3);
//        System.out.println(ascending);
//    }
//    public static int sumEven(ArrayList<Integer> ascending) {
//        int total = 0;
//        for (int integer : ascending) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//            return total;
//        }
//
//    }
//
