package Sesión01Reto02;

public class Entrada {

    String nombreEv;
    double precio;

    public Entrada (String nombreEv, double precio){
        this.nombreEv = nombreEv;
        this.precio = precio;
    }   

    public void mostrarInformacion(){
        System.out.println("Evento: " + nombreEv + " | Precio: $" + precio );
        

    }
    
}
