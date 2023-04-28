package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EVA3_5_CAPTURAR_DATOS {


    public static void main(String[] args) {
        int valor;
        do{
            try{
        Scanner input = new Scanner(System.in);
        System.out.println(" Introdcue un valor (numero entero):");
        valor = input.nextInt();
        break;
        } catch(InputMismatchException e){
                System.out.println(" El valor es erroneo, no se puede convertir a numero");
        } 
            catch (ArithmeticException e){
           System.out.println(" No se puede dividir entre cero");
       }
            
        }while(true);
        
        System.out.println("El valor capturado es: "+valor);
        
        
    }
    
}
