package Rectangulo;

public class Rectangulo {
    private double ancho;
    private double alto;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double obtenerArea(){
        return  alto*ancho;
    }
    public double obtenerPerimetro(){
        return 2*alto+2*ancho;
    }
}
