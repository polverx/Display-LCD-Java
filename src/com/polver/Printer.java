package com.polver;

class Printer {

  void displayFullNumberLine(int size, String number) {

    Printer lcdNumber = new Printer();

    int numberLength = number.length();
    int[] numberDigit = new int[numberLength];

    for (int i = 0; i < numberLength; i++) {
      numberDigit[i] = number.charAt(i)-48;
    }

    //Aquí comienza la impresión
    for (int i = 0; i < numberLength; i++) {
      lcdNumber.printDigitTop(numberDigit[i], size);
    }

    System.out.println();

    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < numberLength; j++) {
        lcdNumber.printDigitMidTop(numberDigit[j], size);
      }
      System.out.println();
    }

    for (int i = 0; i < numberLength; i++) {
      lcdNumber.printDigitMid(numberDigit[i], size);
    }

    System.out.println();

    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < numberLength; j++) {
        lcdNumber.printDigitMidBot(numberDigit[j], size);
      }
      System.out.println();
    }

    for (int i = 0; i < numberLength; i++) {
      lcdNumber.printDigitBot(numberDigit[i], size);
    }
  }

  private void printDigitTop(int number, int size) {
    System.out.print(" ");

    for (int i = 1; i <= size; i++) {
      if (number==1||number==4) {
        System.out.print("  ");
      }
      else {
        System.out.print("--");
      }
    }

    System.out.print("  ");
  }

  private void printDigitMidTop(int number, int size) {
    if (number==1||number==2||number==3||number==7) {
      System.out.print(" ");
    }
    else {
      System.out.print("|");
    }

    for (int i = 1; i <= size; i++) {
      System.out.print("  ");
    }

    if (number==5||number==6) {
      System.out.print("  ");
    }
    else {
      System.out.print("| ");
    }
  }

  private void printDigitMid(int number, int size) {
    System.out.print(" ");

    for (int i = 1; i <= size; i++) {
      if (number==1||number==7||number==0) {
        System.out.print("  ");
      }
      else {
        System.out.print("--");
      }
    }

    System.out.print("  ");
  }

  private void printDigitMidBot(int number, int size) {
    if (number==1||number==3||number==4||number==5||number==7||number==9) {
      System.out.print(" ");
    }
    else {
      System.out.print("|");
    }

    for (int i = 1; i <= size; i++) {
      System.out.print("  ");
    }

    if (number==2) {
      System.out.print("  ");
    }
    else {
      System.out.print("| ");
    }
  }

  private void printDigitBot(int number, int size) {
    System.out.print(" ");

    for (int i = 1; i <= size; i++) {
      if (number==1||number==4||number==7) {
        System.out.print("  ");
      }
      else {
        System.out.print("--");
      }
    }

    System.out.print("  ");
  }
}
