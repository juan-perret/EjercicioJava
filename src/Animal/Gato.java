package Animal;

public class Gato extends Animal{
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    public String comunicacion() {
        return "Maulla";
    }
}
