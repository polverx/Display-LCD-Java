package com.polver;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner lectura = new Scanner(System.in);
        String ingresoAux = new String();

        System.out.println("Ingrese el número separado por una ( , ) : ");

        do
        {
            String ingresoBaseArr = lectura.nextLine();
            String[] lecturaAux = ingresoBaseArr.split(",");

            if (Integer.parseInt(lecturaAux[0]) == 0 && Double.parseDouble(lecturaAux[1]) == 0)
                break;

            if (Integer.parseInt(lecturaAux[0]) >= 0 && Integer.parseInt(lecturaAux[0]) <= 10 && Integer.parseInt(lecturaAux[1]) >= 0)
                ingresoAux += ingresoBaseArr + "-";

            else System.out.println("Datos ingresados incorrectamente, por favor volver a intentarlo.");
        }
        while(true);

        String[] ingresoArr = ingresoAux.split("-");
        System.out.println("A continuación podrá ver los números que ingresó:");
        for (int k=0;k<ingresoArr.length;k++)
        {
            dispNum(ingresoArr[k]);
            System.out.println("\n");
        }

    }


    static void dispNum(String ingreso)
    {
        String[] vectorSep = ingreso.split(",");
        int size = Integer.parseInt(vectorSep[0]);
        int numDig = vectorSep[1].length();
        double numero = Double.parseDouble(vectorSep[1]);
        char[] numCharArr = vectorSep[1].toCharArray();
        int[] numIntArr = new int[numDig];

        for (int i = 0; i < numDig; i++)
        {
            numIntArr[i] = (int)numCharArr[i] - 48;
        }

        //Aquí comienza la impresión

        for (int i = 0; i < numDig; i++)
        {
            Top(numIntArr[i], size);
        }

        System.out.println();

        for (int i = 1; i <= size; i++)
        {
            for (int j = 0; j < numDig; j++)
            {
                midTop(numIntArr[j], size);
            }
            System.out.println();
        }

        for (int i = 0; i < numDig; i++)
        {
            Mid(numIntArr[i], size);
        }


        System.out.println();

        for (int i = 1; i <= size; i++)
        {
            for (int j = 0; j < numDig; j++)
            {
                midBot(numIntArr[j], size);
            }
            System.out.println();
        }

        for (int i = 0; i < numDig; i++)
        {
            Bot(numIntArr[i], size);
        }
    }

    static void Top(int a, int b)
    {
        System.out.print(" ");
        for (int i = 1; i <= b; i++)
        {
            if (a==1||a==4) System.out.print(" ");
            else System.out.print("-");
        }
        System.out.print("  ");
    }

    static void midTop(int a, int b)
    {
        if (a==1||a==2||a==3||a==7) System.out.print(" ");
        else System.out.print("|");

        for (int i = 1; i <= b; i++)
        {
            System.out.print(" ");
        }

        if (a==5||a==6) System.out.print("  ");
        else System.out.print("| ");
    }

    static void Mid(int a, int b)
    {
        System.out.print(" ");
        for (int i = 1; i <= b; i++)
        {
            if (a==1||a==7||a==0) System.out.print(" ");
            else System.out.print("-");
        }
        System.out.print("  ");
    }

    static void midBot(int a, int b)
    {
        if (a==1||a==3||a==4||a==5||a==7||a==9) System.out.print(" ");
        else System.out.print("|");

        for (int i = 1; i <= b; i++)
        {
            System.out.print(" ");
        }

        if (a==2) System.out.print("  ");
        else System.out.print("| ");
    }

    static void Bot(int a, int b)
    {
        System.out.print(" ");
        for (int i = 1; i <= b; i++)
        {
            if (a==1||a==4||a==7) System.out.print(" ");
            else System.out.print("-");
        }
        System.out.print("  ");
    }
}
