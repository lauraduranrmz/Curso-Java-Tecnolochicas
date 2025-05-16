package Sesión05Reto01;

public class Operador {
      String nombre;

    public Operador(String nombre) {
        this.nombre = nombre;
    }

    public void reportarse() {
        System.out.println("Operador " + nombre + " reportándose.");
    }

}
