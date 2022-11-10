package Retos;
import java.util.Scanner;
import java.util.Random;

public class Reto4 {

    /**
     * @param args
     */
    public static void main(String[]args){

        try (Scanner Scan = new Scanner(System.in)) {

            System.out.println("Escoja entre: ");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijeras");

            int D1 = Scan.nextInt();

            System.out.println("===============================");

            Random Rand = new Random();

            int D2 = Rand.nextInt((3-1)+1)+1;

            if (D2==1) {

                System.out.println(" Salio Piedra ");
                
            }else if (D2==2){

                System.out.println(" Salio Papel ");

            }else {

                System.out.println(" Salieron Tijeras ");

            }

            System.out.println("===============================");

            if (D1==D2) {

                System.out.println(" Empate ");
                
            }
            else if (D1>1){

                System.out.println(" Ganó Papel ");

            }else if (D1>2){

                System.out.println(" Ganó Tijeras ");

            }
            //else if (D1!=1){

              //  System.out.println(" Ganó Papel ");

            //}else if(D1!=2){

             //   System.out.println("  ");

           // }else if (D1!=3){

                //System.out.println(" Ganó Piedra ");

            //}
            else if (D2>2) {

                System.out.println(" Ganaron las Tijeras ");

            }else if (D2<2) {

                System.out.println(" Ganó Papel ");
                

            }else if (D2!=3) {

                System.out.println(" Ganó Papel ");

            }else if (D2!=2){

                System.out.println(" Ganó Piedra ");

            }else if (D2!=1){

                System.out.println(" Ganaron las Tijeras ");

            }

            System.out.println("===============================");



        }

    }
    
}
