package Sesion02Reto01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SimuladorFarmacia sim = new SimuladorFarmacia();

        System.out.print("Nombre del medicamento: ");
        sim.medicamento = teclado.nextLine();

        System.out.print("Precio unitario: ");
        sim.precio = teclado.nextDouble();

        System.out.print("Cantidad de piezas: ");
        sim.cant = teclado.nextInt();

        teclado.close();

        sim.mostrarInfo();
        
    }
    
}
