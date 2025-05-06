package Ejemplo02_Sesión3;

public class Principal {
    public static void main(String[] args) {
        Metodos util = new Metodos();
         // 1. Método sin parámetros y sin retorno
         util.mostrarBienvenida(); 

         util.mostrarSuma(10, 20); 
         int suma = util.obtenerSuma(5, 7);
         System.out.println("🧮 Resultado: " + suma);
         int x = 10;
        util.duplicar(x);
        System.out.println("Fuera del método: " + x);  // x no cambia


        Persona persona = new Persona("Mario");
        util.cambiarNombre(persona);
        System.out.println("Nombre actualizado: " + persona.nombre);
                util.saludar();              // Hola
        util.saludar("Mario");       // Hola, Mario
    }
    
}
