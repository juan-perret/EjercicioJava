package Empleado;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado>empleados;

    public Empresa(){
        empleados=new ArrayList<Empleado>();
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public int calcularSalarioTotal(){
        int salarioTotal=0;
        for (Empleado empleado : empleados){
            salarioTotal+= empleado.getSalario();
        }
        return salarioTotal;
    }
}
