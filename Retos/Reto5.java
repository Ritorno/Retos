package Retos;
import java.util.Scanner;

public class Reto5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        int D1 = 0;
        int D2 = 0;
        int D3 = 0;
        int i;
        int Acum = 0;
        int Resultado;
        int Resultado2 = 0;
        int Resultado3 = 0; 
        int Count = 0;
        

        try (Scanner Scan = new Scanner(System.in)) {


            for(i = 0;i < 5; i++){

                System.out.println(" Ingrese el valor del producto ");
                D1 = Scan.nextInt();

                Acum = Acum + D1;

                System.out.println(" ============================== ");

                


            }

                Resultado = D1 + D1;

                System.out.println(" Su total es de: " + Acum);


            //do{

                //System.out.println(" Ingrese el valor del producto ");
                //D1 = Scan.nextInt();

                //System.out.println(" Ingrese el siguiente valor de producto ");
                //D3 = Scan.nextInt();

                //D2 = D2 + 1;

                

 
                //System.out.println(" ============================== ");

                //System.out.println(" Para continuar digite: 0");

                //Resultado2 = D1 + D3;
                
                //System.out.println(" Para salir digite: 1");
              //  D2 = Scan.nextInt();

                               
       
                

            //}while(D2 < 1);

            //System.out.println(" ============================== ");

            //Resultado = D1 + Resultado2;

            //Resultado3 = Resultado2 + D1;

            //System.out.println(" Su total es de: " + D2 + (". ") + Resultado3);


        }


    }
    
}
