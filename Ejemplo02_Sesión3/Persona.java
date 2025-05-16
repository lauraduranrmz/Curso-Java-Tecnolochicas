package Ejemplo02_Sesión3;

public class Persona {
    String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public void cambiarNombre(Persona persona) {
        persona.nombre = "Nuevo nombre";
    }
   

   
}
