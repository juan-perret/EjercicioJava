package Empleado;

public class Programador extends Empleado{

    public Programador(String nombre, int salario, String departamento, int numeroProyectos) {
        super(nombre, salario, departamento);
        this.numeroProyectos = numeroProyectos;
    }

    private int numeroProyectos;

    public int getNumeroProyectos() {
        return numeroProyectos;
    }
}
