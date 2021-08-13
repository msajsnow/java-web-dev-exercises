package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    Student(String name, int studentId, int numberOfCredits){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
    }

    public void setName(String aName) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }
    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }
    public void setGpa(double gpa){
        this.gpa =gpa;
    }
    public double getGpa(){
        return this.gpa;
    }
}