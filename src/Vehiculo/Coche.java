package Vehiculo;

public class Coche extends vehiculo{
    private int numeroPasajeros;

    public Coche(String marca, String modelo, int numeroRuedas, int numeroPasajeros) {
        super(marca, modelo, numeroRuedas);
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
}
