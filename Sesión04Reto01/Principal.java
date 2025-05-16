package Sesión04Reto01;

public class Principal {
     public static void main(String[] args) {


        // se crean dos facturas con el mismo folio
        Factura f1 = new Factura("FAC001", "Laura Durán", 1450.00);
        Factura f2 = new Factura("FAC001", "Comercial CITADEL", 1450.00);

        // mostrar ambas facturas con toString()
        System.out.println(f1);
        System.out.println(f2);

        // Comparar si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }

    
}
