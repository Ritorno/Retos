package Retos;
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) 
    {
      
        try (Scanner Scan = new Scanner(System.in)) {
            System.out.println("Bienvenido al programa de calculo de dosis de vacunas para un bebe.");
   
            System.out.println("Por favor ingresar el peso del bebe en kilogramos: " );
            double Peso = Scan.nextDouble();

            System.out.println("Por favor ingresar los meses del bebe: " );
            int  Meses = Scan.nextInt();
        
        double Dosis = (Peso + 10) / (Meses * 10) * 8;

        System.out.println("La dosis adecuada a aplicar al bebe es: " + Dosis );

       

            }
      

    }
}