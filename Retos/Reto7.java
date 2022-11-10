package Retos;
import java.util.Scanner;



public class Reto7 {

    public static void main(String[]args){


        double [] P1 = new double [10];
        
        int i = 0;

        try (Scanner Scan = new Scanner(System.in)) {
            for(i= 0; i<5;i++){

                System.out.println("Digite la nota: " + i);
                P1[i]=Scan.nextInt();

                System.out.println(" ============================== ");
             

            }
            double X = (P1[1] * i)/i;
            System.out.println("Su promedio es de: " + X);

            System.out.println(" ============================== ");

            if(X<30){

                System.out.println(" Se la tiro ");


            }else if(X==30){

                System.out.println(" Pasó Raspando ");

            }else if(X<40){

                System.out.println(" Pasó Raspando ");

            }else if (X>40){

                System.out.println(" Nota Superior ");

            }else {

                System.out.println(" !!ERROR!! ");

            }

            System.out.println(" ============================== ");
                
           
        }


    }


    
}
