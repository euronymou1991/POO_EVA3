
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        //ARITHMETIC EXPECTION: DIVISION ENTRE CERO
        System.out.println("INICIANDO EL PROGRAMA");
        System.out.println("DECLARANDO VARIALES");
        int x=5, y=0; //AQUI SE GENERA LA EXCEPCION
                      //SI NO SE ATIENDE , EL PROGRAMA TERMINA
        System.out.println("INTENTAR LA DIUVISION");
        int resu = x/y;
        System.out.println("Resultado: "+resu); //YA NO SE EJECUTA 
        
          //INPUTMISMATCH EXCEPTION
   Scanner input=new Scanner (System.in);
        System.out.println("INTRODUCE UN NUMERO");
    int nume = input.nextInt(); //SI EL USUARIO CAPTURA UNA CADENA QUE NO PUEDE CONVERTIRSE A NUMERO, SE PRODUCE
                     //LA EXCEPCION Y TERMINA EL PROGRAMA
       System.out.println("EL NUMERO ES: "+nume);     
    
    
    //ARRAYINDEXOUTBOUNDS EXCEPTION
    int [] arreglo= new int [5]; //ARREGLO CON 5 POSICIONES
    arreglo[0]=100;
    arreglo[1]=200;
    arreglo[2]=300;
    arreglo[3]=400;
    arreglo[4]=500;
    arreglo[5]=600;//<--? NO ES UN INDICE VALIDO, EL ARREGLO VA DE 0 A 4 
    
    
    //NULLPOINTER EXCEPTION
    Prueba objPrueba= null; //EL OBJETO NO EXISTE, ES NULO
        System.out.println("Valor de x = " + objPrueba.x);
    
    }
  
}
 class Prueba{
     int x =100;
 }
