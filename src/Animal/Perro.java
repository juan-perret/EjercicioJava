package Animal;

public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String comunicacion() {
        return "ladra";
    }
}
