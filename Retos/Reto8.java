package Retos;
import java.util.Scanner;

public class Reto8 {

    public static void main(String[]args){

        String [] D1 = new String [4];

        double [] T1 = new double [4];


        try (Scanner Scan = new Scanner(System.in)) {

            System.out.println(" ==================== ");
            System.out.println(" ______Natación______ ");
            System.out.println(" ==================== ");


            for(int i = 1; i<D1.length;i++){

                System.out.println(" Ingrese el nombre del competidor: " + i);
                D1[i] = Scan.next();
                System.out.println(" Ingrese el timepo de competidor: " + i);
                T1[i] = Scan.nextDouble();

                System.out.println(" ==================== ");
            }

            if(T1[1]<=10){

                System.out.println(" El mas rapido: " + D1[1] );
                System.out.println(" ==================== ");


            }else if(T1[1]>10){

                System.out.println(" de los mas rapidos: " + D1[1]);
                System.out.println(" ==================== ");

            }else if(T1[1]>25){

                System.out.println(" Toca mejorar: " + D1[1]);
                System.out.println(" ==================== ");

            }


        }



    }

    
    
}
