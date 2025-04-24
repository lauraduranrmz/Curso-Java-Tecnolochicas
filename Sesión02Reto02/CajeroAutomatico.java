package Sesión02Reto02;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //objeto teclado
        var saldo = 1000.0; //saldo inicial
        int opcion;  //almacenar la opcion del menu

        //hay que repetir el menú mientras la opcion no sea salir (4)

        do{
            System.out.println("\n Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1-> {
                    //Consultar saldo
                    System.out.println("Tu saldo actual es: $"+ saldo);
                }
                case 2 ->{
                    //Depositar dinero
                    System.out.println("Ingresa el monto a depositar:");
                    double deposito = teclado.nextDouble();
                    if(deposito<=0){
                        //validar que el monto sea mayor a cero
                        System.out.println("El monto debe ser mayor a 0.");
                        continue; //volver al menu sin modificar el saldo
                    }
                    saldo+= deposito; //aumentar el saldo
                    System.out.println("Depósito realizado. Saldo actualizado: $"+ saldo);
                }
                case 3 ->{
                    //Retirar dinero
                    System.out.println("Ingresa el monto a retirar: ");
                    double retiro = teclado.nextDouble();

                    if ( retiro <= 0){
                        //validar que el monto sea mayor a 0
                        System.out.println("El monto debe ser mayor a 0");
                        continue; //volver al menú sin hacer nada
                    }

                    if(retiro > saldo){
                        System.out.println("Saldo insuficiente. Tu saldo es: $"+ saldo);
                    }else{
                        saldo-=retiro; // restar el monto del saldo
                        System.out.println("Retiro exitoso. Saldo restante: $"+ saldo);
                    }
                }

                case 4 ->{
                    //salir del programa
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                }
                default ->{
                    //opcion no valida
                    System.out.println("Opción inválida. Intenta nuevamente");
                }
            }
        }while (opcion != 4);
        
        teclado.close();
    }
    
}
