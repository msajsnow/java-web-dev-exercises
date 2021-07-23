package org.launchcode.java.demos.lsn2controlflowandcollections;

import exercises.ArrListPracticeNum;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGradebook {

    public static void main(String[] args) {
        ArrayList<Integer> myAscending = new ArrayList<>();
        myAscending.add(0);
        myAscending.add(1);
        myAscending.add(2);
        myAscending.add(3);
        myAscending.add(4);
        myAscending.add(5);
        myAscending.add(6);



        int resultOfSumEven = ArrListPracticeNum.sumEven(myAscending);
        System.out.println(resultOfSumEven);
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));

        // Get student grades
        for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
