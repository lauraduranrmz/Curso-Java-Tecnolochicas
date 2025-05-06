package Sesión03Reto01;

public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida){
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    //Método con parámetri y valor de retorno
    public boolean reservarAsiento(Pasajero p){
        if(asientoReservado == null){
            asientoReservado = p;
            return true;
        }else{
            return false;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevPasajero);
    }

    //Método sin retorno
    public void cancelarReserva(){
        asientoReservado = null;
    }

    //Método que retorna un String
    public String obtenerItinerario(){
        String info = "Itinerario del vuelo: \n";
        info+= "Código: "+ codigoVuelo + "\n";
        info+= "Destino: "+ destino +"\n";
        info+= "Salida: "+ horaSalida + "\n";
        if(asientoReservado != null){
            info+="Pasajero:" + asientoReservado.nombre + "\n";
        }else{
            info+= "Pasajero: [Sin reserva]\n";
        }
        return info;

    }
}
