package Vehiculo;

public class vehiculo {
    private String marca;
    private String modelo;
    private int numeroRuedas;

    public vehiculo(String marca, String modelo, int numeroRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroRuedas = numeroRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }
}
