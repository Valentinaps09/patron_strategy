package co.edu.uniquindio.poo;

public class CalculoImpuestosElectronicos implements CalculoImpuestos{
    @Override
    public double calcularImpuestos(double precio) {
        // 20% de impuestos para productos electrónicos
        return precio * 0.20;
    }
    
}
