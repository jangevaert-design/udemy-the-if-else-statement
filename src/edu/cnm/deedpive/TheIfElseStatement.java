package edu.cnm.deedpive;

public class TheIfElseStatement {

  public static void main(String[] args) {
    boolean b = true;

    if (b) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

//    int x = 1;
//    if (x) {
//      this will not compile because you need a boolean inside the curly braces.
//    }
//    if (x = 1) {
//      will also not compile because you need the == operator in a boolean.
//    }

    int testScore = 67;
    char grade;

    if (testScore >= 90) {
      grade = 'A';
    } else if (testScore >= 80) {
      grade = 'B';
    } else if (testScore >= 70) {
      grade = 'C';
    } else {
      grade = 'F';
    }
    System.out.println("grade = " + grade);

    int hoursOfDay = 10;
    if (hoursOfDay < 11) System.out.println("Morning");
    else if (hoursOfDay < 17) System.out.println("Afternoon");
    else System.out.println("Evening");
    //this is allowed although not good practice. Once you have more than one line of code within
    //if, else if or else statement, you need curly braces.
    

  }

}
