package Retos;
import java.util.Scanner;

public class Reto10 {

    public class Persona{

        String TipoDoc;
        int Doc;
        String Nombre;
        String Apellido;
        double Peso;
        double Estatura;
        int Edad;
        String Sexo;

        public void pedirDatos(){

            
            try (Scanner Scan = new Scanner(System.in)) {
            

            System.out.println(" Ingrese sus datos ");
            System.out.println(" ====================== ");

            System.out.println(" Nombre ");
                Nombre = Scan.next();
            System.out.println(" ====================== ");
            System.out.println(" Apellido ");
                Apellido = Scan.next();
            System.out.println(" ====================== ");
            System.out.println(" Edad ");
                Edad = Scan.nextInt();
            System.out.println(" ====================== ");
            System.out.println(" Sexo ");
                Sexo = Scan.next();
            System.out.println(" ====================== ");
            System.out.println(" Tipo de Documento ");
                TipoDoc = Scan.next();
            System.out.println(" ====================== ");
            System.out.println(" Documento ");
                Doc = Scan.nextInt();
            System.out.println(" ====================== ");
            System.out.println(" Estatura (En Metros) ");
            Estatura = Scan.nextDouble();
            System.out.println(" ====================== ");
            System.out.println(" Peso (en Kilogramos) ");
                Peso = Scan.nextDouble();
            System.out.println(" ====================== ");

            } 

        }


        public void mostrarPersona(){

            System.out.println(" Su nombre es: " + Nombre);
            System.out.println(" Su Apellido es: " + Apellido);
            System.out.println(" Su Edad es: " + Edad);
            System.out.println(" Su Sexo es: " + Sexo);
            System.out.println(" Su Tipo de Documento es: " + TipoDoc);
            System.out.println(" Su Documento es: " + Doc);
            System.out.println(" Su Estatura es: " + Estatura);
            System.out.println(" Su Peso es: " + Peso);

            if(Edad>18){

                System.out.println(" Mayor de edad ");

            }else if(Edad<18){

                System.out.println(" Menor de edad ");

            }else if(Edad<0){

                System.out.println(" ingrese una edad valida");

            }else{

                System.out.println(" !!ERROR!! ");

            }

        }

        public void calcularlmc(){

            double X = Peso/Estatura;
            double pesoActual= Math.pow(X, 2) ;
            System.out.println(" Usted se encuentra: " + pesoActual);

            if(pesoActual<20){

                System.out.println(" Su peso se encuentra por debajo de lo ideal ");

            }else if(pesoActual>20){

                System.out.println(" Su peso es el ideal ");


            }else if(pesoActual<25){

                System.out.println(" Su peso es el ideal ");


            }else if (pesoActual>25){

                System.out.println(" Su peso se encuentra en sobre peso ");


            }else{

                System.out.println(" !!ERROR!! ");

            }

        }

        

    }
    
    
    

    
}

