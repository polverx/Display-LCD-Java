package com.polver;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stringInput = new Scanner(System.in);
    ArrayList<Integer> size = new ArrayList<>();
    ArrayList<String> number = new ArrayList<>();
    Printer numberReady = new Printer();

    System.out.println("Ingrese el número separado por una ( , ) : ");

    do {
      String scannerInput = stringInput.nextLine();
      String[] scannerInputSplit = scannerInput.split(",");

      int sizeInput = Integer.parseInt(scannerInputSplit[0]);
      double numberInputDouble = Double.parseDouble(scannerInputSplit[1]);
      String numberInputString = scannerInputSplit[1];

      if (sizeInput == 0 && numberInputDouble == 0) {
        break;
      }
      if (sizeInput >= 0 && sizeInput <= 10 && numberInputDouble >= 0) {
        size.add(sizeInput);
        number.add(numberInputString);
      }
      else {
        System.out.println("Datos ingresados incorrectamente, por favor volver a intentarlo.");
      }
    }
    while(true);

    System.out.println("A continuación podrá ver los números que ingresó:");
    for (int i = 0; i < number.size(); i++) {
      numberReady.displayFullNumberLine(size.get(i),number.get(i));
      System.out.println("\n");
    }
  }
}