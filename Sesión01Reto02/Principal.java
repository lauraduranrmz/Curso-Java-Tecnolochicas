package Sesión01Reto02;

public class Principal {
    public static void main(String[] args) {
        
        Entrada evento1 = new Entrada("Concierto Morat", 3200.50);

        Entrada evento2 = new Entrada("Concierto Shakira", 10000.00);
        
       evento1.mostrarInformacion();

       evento2.mostrarInformacion();

       //Record
       Entrada_Record evento3 = new Entrada_Record("Concierto Olivia Rodrigo", 8500.90);
       evento3.mostrarInformacion();


    }
    
}
