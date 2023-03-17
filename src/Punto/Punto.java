package Punto;

public class Punto {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double distanciaEntreNumeros(Punto coordenadaA, Punto coordenadasB){
        double distancia= Math.sqrt(Math.pow(coordenadasB.x-coordenadaA.x,2)+Math.pow(coordenadasB.y-coordenadaA.y,2));
        return distancia;
    }
}
