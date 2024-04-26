package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear productos
        Producto libro = new Producto("Libro", 20, new CalculoImpuestosBasicos());
        Producto telefono = new Producto("Teléfono", 500, new CalculoImpuestosElectronicos());

        // Calcular y mostrar los impuestos de cada producto usando su estrategia
        // correspondiente
        System.out.println("Impuestos para el libro: $" + libro.calcularImpuestos());
        System.out.println("Impuestos para el teléfono: $" + telefono.calcularImpuestos());
    }
}
