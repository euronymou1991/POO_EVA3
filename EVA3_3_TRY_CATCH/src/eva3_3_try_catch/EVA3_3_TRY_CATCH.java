
package eva3_3_try_catch;

public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
     int x=5, y=1;
     try{ //SECCION DE CODIGO QUE PONTENCIALMENTE GENERA UNA EXCEPCION
         
     int resu= x/y;
        System.out.println("Resultado = "+ resu);
     }catch(ArithmeticException e ){//SE GENERA UN OBJETO EXCEPTION LLAMADO "e" de tipo ArithmeticException
         System.out.println("Se produjo un error: "+ e.getMessage());
     }
        System.out.println("Programa Terminado");
    }
    
}
