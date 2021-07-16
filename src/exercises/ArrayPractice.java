package exercises;
import java.util.Scanner;

public class ArrayPractice {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    int[] integerArray = {1, 1, 2, 3, 5, 8};
//        System.out.println("Odd Numbers:");

        for (int i = 0; i < integerArray.length; i++) {
//            System.out.println(integerArray[i] + " , ");

           if(integerArray[i]%2!=0) {
               System.out.println(integerArray[i] + " ,");
           }

        }
    }
}
