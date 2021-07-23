package org.launchcode.java.studio2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string in the command line");
        String userInput = input.nextLine();

        String inputStr = "Java is fun to learn!";
        char[] charInString = inputStr.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char letter : charInString) {
            if (charCount.containsKey(letter))
                if (charCount.containsKey(letter)) {
                    charCount.put(letter, charCount.get(letter) + 1);
                } else {
                    charCount.put(letter, 1);
                }
        }
        for (Map.Entry<Character, Integer> printChar : charCount.entrySet()) {
            System.out.println(printChar.getKey() + " : " + printChar.getValue());
        }
    }
    }

