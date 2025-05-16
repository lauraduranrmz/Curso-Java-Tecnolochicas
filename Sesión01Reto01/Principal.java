package Sesión01Reto01;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");

        p1.nombre = teclado.nextLine();

        System.out.print("Ingresa la edad: ");

        p1.edad = teclado.nextInt();
        teclado.nextLine(); //se limpia el buffer para poder imprimirlo 

        System.out.print("Ingresa el numero de expediente: ");

        p1.numeroExp = teclado.nextLine();

        teclado.close();

        p1.mostrarInformacion();
    }
}
