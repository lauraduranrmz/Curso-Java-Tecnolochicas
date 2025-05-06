package Sesión03Reto01;

public class Principal {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Laura Durán", "P101217");

        Vuelo vuelo = new Vuelo("UX120", "Corea del Sur", "7:00");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if(reservado){
            System.out.println("Reserva realizada con exito.\n");
        }else{
            System.out.println("No se pudo realizar la reserva. \n");
        }

        System.out.println(vuelo.obtenerItinerario());

        System.out.println("Cancelando reserva... \n");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Cecilia Durán", "P100205");
        System.out.println(vuelo.obtenerItinerario());

    }
}
