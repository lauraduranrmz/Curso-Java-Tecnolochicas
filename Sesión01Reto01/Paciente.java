package Sesión01Reto01;


public class Paciente {
    
      String nombre;
      int edad;
      String numeroExp;

      public void mostrarInformacion(){

            System.out.println("Información del(la) paciente: ");

            System.out.println("Paciente: " + nombre);

            System.out.println("Edad: " + edad);

            System.out.println("Expediente: " + numeroExp);
      }
    
}
