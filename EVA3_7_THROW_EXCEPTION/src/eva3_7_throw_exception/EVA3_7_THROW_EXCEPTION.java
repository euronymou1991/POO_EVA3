
package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (System.in);
            System.out.println(" Introduce un valor positivo");
            int valor = input.nextInt();
            Prueba obj = new Prueba();
            obj.setValor(valor);
        } catch (Exception ex) { //ES LA SUPER CLASE DE TODAS LAS EXCEPCIONES
                                 // POR TANTO, CAPTURA TODAS LAS EXCEPCIONES
                                 // COMPLICA DETECTAR EL TIPO DE EXCEPCION, Y DAR LA SOLUCION CORRECTA
            System.out.println( ex.getMessage());
        }
            
        }
        //obj no existe fuera del bloque try, porque ahi fue declarado
    
    
}

class Prueba{
    private int valor;

    public int getValor() {
        return valor;
    }
    // checked exception: se deben resolver en tiempo de compilacion
    // unchecked exception: errores de logica, del programador, Java no te obliga a resolverlas
    public void setValor(int valor) throws Exception  {
        if (valor < 0 )
            //EXCEPTION ES DEL TIPO UNCHECKED
            throw new Exception(" El valor  " + valor+ " Es invalido. Debe ser mayor o igual a cero");
        else 
            
        this.valor = valor;
    }
    
}
