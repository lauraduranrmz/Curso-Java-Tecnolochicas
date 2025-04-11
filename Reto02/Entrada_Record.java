package Reto02;

public record Entrada_Record(String nombreEv, double precio) {
    public void mostrarInformacion(){
        System.out.println("Evento: " + nombreEv + " | Precio: $" + precio );
    }

    
}
