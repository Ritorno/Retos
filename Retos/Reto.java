package Retos;
import java.util.Scanner;


public class Reto {
    public static void main(String[] args)
    {
    
      
        try (Scanner Scan = new Scanner (System.in)) {
            
            double F, C;
            System.out.println("Ingrese la cantidad de grados Fahrenheit a convertir a centigrados");
            F = Scan.nextDouble();
            C = (F-32)/1.8;
            System.out.println(F+" 350Grados Fahrenheit equivalen a: "+ C +" Grados centigrados");
            System.out.println("Muchas gracias por usar el programa, se le devolvera al inicio.");
            System.out.println("  ");
            Scan.close();
        }
         
            
    }
}