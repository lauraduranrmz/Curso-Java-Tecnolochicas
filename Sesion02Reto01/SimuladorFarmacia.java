package Sesion02Reto01;



public class SimuladorFarmacia {

        String medicamento;
        double precio;
        int cant;

        public void mostrarInfo()
        {

                
        double total = precio * cant;

        boolean aplicadesc = total > 500;

        double desc = aplicadesc ? total * 0.15 : 0;

        double total_fin = total - desc;

                System.out.println("Medicamento: " + medicamento);
                System.out.println("Cantidad: " + cant);
                System.out.println("Precio unitario: $"+ precio);
                System.out.println("Total sin descuento: $"+ total);
                System.out.println("¿Aplica descuento?: "+ aplicadesc);
                System.out.println("Descuento: $"+ desc);
                System.out.println("Total a pagar: $"+ total_fin);

        }

  
}
