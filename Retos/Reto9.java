package Retos;
import java.util.Scanner;

public class Reto9 {

    public static void main(String[]args){

        int[][] V1 = new int[8][8];
        String[][] P1 = new String[8][8]; 


        try (Scanner Scan = new Scanner(System.in)) {


            System.out.println(" ================= ");
            System.out.println(" Maquina Expendedora ");
            System.out.println(" ================= ");

            for(int Fila=1;Fila<P1.length;Fila++){

                for(int Colum=1;Colum<V1.length;Colum++){

                    System.out.println(" ingrese el nombre del producto: " + Fila + " valor " + Colum);

                    P1[Fila][Colum] = Scan.next();

                    System.out.println( P1[Fila][Colum]+"\t");

                    
                }

                System.out.println(" ");

            }




        }

    }

    
}
