import Empleado.Director;
import Empleado.Empresa;
import Empleado.Programador;
import Vehiculo.Camion;
import Vehiculo.Coche;
import Vehiculo.Moto;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("audi", "A1", 2, 4);
        Camion camion1 = new Camion("Mercedes", "Vito", 12);
        Moto moto1 = new Moto("Honda", "bis", 2);

        System.out.println("Coche marca " + coche1.getMarca() + " Modelo " + coche1.getModelo() + " numeros de ruedas " + coche1.getNumeroRuedas() + " numero pasajeros " + coche1.getNumeroPasajeros());
        System.out.println("Camion marca " + camion1.getMarca() + " Modelo " + camion1.getModelo() + " numero de ruedas " + camion1.getNumeroRuedas());
        System.out.println("Moto marca " + moto1.getMarca() + " Modelo " + moto1.getModelo() + " numero de ruedas " + moto1.getNumeroRuedas());

        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(new Director("Juan", 5000, "Dirección General"));
        empresa.agregarEmpleado(new Programador("Pedro", 2000, "Desarrollo de Software", 3));
        empresa.agregarEmpleado(new Programador("María", 2500, "Desarrollo de Software", 5));
        System.out.println("El salario total de la empresa es: $" + empresa.calcularSalarioTotal());

    }
}