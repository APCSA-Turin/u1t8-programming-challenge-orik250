package com.example.project;

public class Student {
    // INSTANCE VARIABLES (private)
    private String fName;
    private String lName;
    private int gYear;
    private double scoreSum;
    private int scoreCount;
    private double highestScore;
    // last name (String)
    // graduation year (int)
    // sum of test scores (double).. should initialize at 0.0
    // test score count (int) ..should initialize at 0
    // highest test score (double).. should initialize at 0.0
    
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        this.fName=firstName;
        this.lName=lastName;
        this.gYear=gradYear;
        this.scoreSum=0.0;
        this.scoreCount=0;
        this.highestScore=0.0;


    }

    // returns firstName
    public String getFirstName() {
        //implement code here!
        return fName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestScore; //random double number
    }

    public int getTestScoreCount(){
        //implement code here!
        return scoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return gYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        this.gYear=newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        scoreSum+=newTestScore;
        scoreCount++;
        if (newTestScore>highestScore){
            highestScore=newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        if (scoreCount==0){
            return false;
        }else{
            return averageTestScore()>=65;
    }   }
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        if (scoreCount==0){
            return 0.0;
        }else{
            return scoreSum/scoreCount; //random double number
        }
    }

 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 