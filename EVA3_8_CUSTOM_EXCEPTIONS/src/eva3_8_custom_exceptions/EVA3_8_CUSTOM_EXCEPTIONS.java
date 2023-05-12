
package eva3_8_custom_exceptions;

public class EVA3_8_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {
        
     Persona perso = new Persona();
     perso.setNombre("Sergio");
     perso.setApellido("Perez");
     try{
         perso.setEdad(-2);
     }catch(DatoIncorrectoCheckEx e){
             System.out.println(e.getMessage());
             }
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

      public Persona() {
        this.nombre = " ";
        this.apellido = " ";
        this.edad = 0;
    }
    public Persona(String nombre, String apellido, int edad) throws DatoIncorrectoCheckEx {
        this.nombre = nombre;
        this.apellido = apellido;
       setEdad(edad);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckEx {
        if (edad <0)
           // throw new DatoIncorrectoException(); //UNCHECKED EXCEPTION
            throw new DatoIncorrectoCheckEx();  //CHECKED EXCEPTION
        this.edad = edad;
        
    }
    
    
}

class DatoIncorrectoException extends RuntimeException{

    boolean getMessage;

    public DatoIncorrectoException() {
        super(" Dato Incorrecto!! El valor introducido no puede ser negativo. ");
    }
    
}

class DatoIncorrectoCheckEx extends Exception{

    public DatoIncorrectoCheckEx() {
        super(" Dato Incorrecto!! El valor introducido no puede ser negativo. ");
    }
    
}

