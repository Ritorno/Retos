package Retos;
import java.util.Scanner;
import java.util.Random;

public class Reto6 {

public static void main(String[]args){

try (Scanner Scan = new Scanner(System.in)) {


    int D3 = 0;
    int D4;
    int D5;
    int Acum = 0;
    int Acum2 = 0;

    System.out.println(" Ingrese una cantidad a apostar ");
        D4 = Scan.nextInt();

        Acum = Acum + D4;
        Acum2 = Acum2 - D4;

        //D5 = Acum + Acum2;

    while(D3 == 0 ){

        


        System.out.println("Escoga, Cara o Cruz");
        System.out.println("1. Cara");  
        System.out.println("2. cruz");

        int D1 = Scan.nextInt();

        System.out.println("===============================");

        Random Rand = new Random();

        int D2 = Rand.nextInt((2-1)+1)+1;

        System.out.println("===============================");

        if (D2==D1) {

            System.out.println(" Ganó Cara " + Acum);


            
        }else if (D2==2) {

            System.out.println(" Ganó Cruz " + Acum);


        } else if (D1!=D2) {

            System.out.println(" Intenta nuevamente " + Acum2);

        } else if (D1!=D2) {

            System.out.println(" Intenta nuevamente "  + Acum2);

        } else {

            System.out.println(" !ERROR! ");

        }



        System.out.println(" ============================== ");

            System.out.println(" Para continuar digite: 0");   
            System.out.println(" Para salir digite: 1");
              D3 = Scan.nextInt();


        System.out.println(" ============================== ");

        System.out.println(" usted finaliza con: " + Acum);



    }




}




}


    
}
