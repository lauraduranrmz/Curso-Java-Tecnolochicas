package Sesión05Reto01;

public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Luis");
        Patrulla patrulla = new Patrulla("Patrulla", "Ana");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Mario");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }

}
