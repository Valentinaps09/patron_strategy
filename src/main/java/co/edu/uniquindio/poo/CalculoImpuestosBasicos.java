package co.edu.uniquindio.poo;

public class CalculoImpuestosBasicos implements CalculoImpuestos{
    @Override
    public double calcularImpuestos(double precio) {
        // 10% de impuestos para productos básicos
        return precio * 0.10;
    }   
}
