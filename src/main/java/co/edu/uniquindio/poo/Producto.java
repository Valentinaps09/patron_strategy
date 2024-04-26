package co.edu.uniquindio.poo;

public class Producto {
    
    private String nombre;
    private double precio;
    private CalculoImpuestos estrategiaImpuestos;

    public Producto(String nombre, double precio, CalculoImpuestos estrategiaImpuestos) {
        this.nombre = nombre;
        this.precio = precio;
        this.estrategiaImpuestos = estrategiaImpuestos;
    }

    public String getNombre() {
        return nombre;
    }


    // Método para calcular los impuestos según la estrategia seleccionada
    public double calcularImpuestos() {
        return estrategiaImpuestos.calcularImpuestos(this.precio);
    }

}
