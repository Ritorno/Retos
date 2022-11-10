package Retos;
import java.util.Scanner;
import java.util.Random;


public class Reto3 {

    public static void main (String[]args){

        try (Scanner Scan = new Scanner(System.in)) {

            System.out.println("Escoga, Cara o Cruz");
            System.out.println("1. Cara");  
            System.out.println("2. cruz");

            int D1 = Scan.nextInt();

            System.out.println("===============================");

            Random Rand = new Random();

            int D2 = Rand.nextInt((2-1)+1)+1;

            System.out.println("===============================");

            if (D2==D1) {

                System.out.println(" Ganó Cara ");
                
            }else if (D2==D1) {

                System.out.println(" Ganó Cruz ");


            } else if (D2!=D1) {

                System.out.println(" Intenta nuevamente ");

            } else if (D2!=D1) {

                System.out.println(" Intenta nuevamente ");

            } else {

                System.out.println(" !ERROR! ");

            }

             


        }



    }

    
}
