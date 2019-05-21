package edu.cnm.deepdive;

import java.util.Scanner;

class sumList {

  public static void main(String[] args) {
    int number;
    Sum numbersList = new Sum();
    Scanner choice = new Scanner(System.in);
    for (; ; ) {
//      do {
        numbersList.askForNumber();
        while (!choice.hasNextInt()) {
          choice.next();
        }
        number = choice.nextInt();

//      } while (numbersList.isValid(number));

      if (number <= 0)
        break;
      System.out.println("\n");
      numbersList.displaySum(number);
    }
  }
}

class Sum {

  void displaySum(int what) {
    int max = 0;
    for (int i = 0; i<= what; i++)
      max += i;
    System.out.println("The sum of 1 through " + what + " is " + max);
    System.out.println();
  }

  void askForNumber() {
    System.out.println("What is the top number of a series you would like to add?");
    System.out.println("ex. 100 adds 1 through 100 and equals 5050");
    System.out.println("Application is limited at 2147483646");
    System.out.print("To quit press 0 then return: ");
  }

  boolean isValid(int ch) {
    return ch > 0;
  }
}