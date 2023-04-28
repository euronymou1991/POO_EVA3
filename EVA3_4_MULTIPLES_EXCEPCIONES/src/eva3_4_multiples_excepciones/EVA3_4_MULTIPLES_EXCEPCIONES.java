
package eva3_4_multiples_excepciones;

import static java.time.Clock.system;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCEPCIONES {


    public static void main(String[] args) {
       int x, y;
       try{
       Scanner input = new Scanner(System.in);
        System.out.println(" Introdcue el valor de x (numero entero):");
        x= input.nextInt();
        System.out.println(" Introdcue el valor de y (numero entero):");
        y= input.nextInt();
        int resu = x/y;
        System.out.println("Resultado de " + x + "/" + y + ":"+ resu);
        
       } catch (InputMismatchException e){
           System.out.println(" Captura en formato incorrecto, no se puede convertir a numero");
           
       }catch (ArithmeticException e){
           System.out.println(" No se puede dividir entre cero");
       }
       
        System.out.println(" Programa terminado exitosamente");
    }
    
}
