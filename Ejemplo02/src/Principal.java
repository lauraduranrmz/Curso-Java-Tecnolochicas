package Ejemplo02.src;

public class Principal {
    public static void main(String[] args){
        // Crear mis objetos
        // 1. Clase 
        // 2. Identificador
        // 3. new + constructor
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombre = "Laura";
        estudiante1.edad = 21;

        estudiante1.saludar();
    }
    
}
