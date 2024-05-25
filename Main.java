class Empleado {
    String nombre;
    int edad;
    double salarioBase;
    int antiguedad;

    Empleado(String nombre, int edad, double salarioBase, int antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.antiguedad = antiguedad;
    }

    double calcularBonificacion() {
        return salarioBase * 0.1 * antiguedad;
    }
}

class Gerente extends Empleado {
    double presupuesto;
    int equipoACargo;

    Gerente(String nombre, int edad, double salarioBase, int antiguedad, double presupuesto, int equipoACargo) {
        super(nombre, edad, salarioBase, antiguedad);
        this.presupuesto = presupuesto;
        this.equipoACargo = equipoACargo;
    }

    double calcularBonificacion() {
        return super.calcularBonificacion() * 2;
    }
}

class Trabajador extends Empleado {
    String area;
    boolean turnoNocturno;

    Trabajador(String nombre, int edad, double salarioBase, int antiguedad, String area, boolean turnoNocturno) {
        super(nombre, edad, salarioBase, antiguedad);
        this.area = area;
        this.turnoNocturno = turnoNocturno;
    }


    double calcularBonificacion() {
        return super.calcularBonificacion() + (turnoNocturno ? 500 : 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 30, 2000, 5);
        Gerente gerente = new Gerente("Ana", 40, 5000, 10, 100000, 20);
        Trabajador trabajador = new Trabajador("Carlos", 25, 1500, 3, "Producción", true);

        System.out.println("Empleado: " + empleado.nombre + ", Edad: " + empleado.edad + ", Bonificación: " + empleado.calcularBonificacion());
        System.out.println("Gerente: " + gerente.nombre + ", Edad: " + gerente.edad + ", Bonificación: " + gerente.calcularBonificacion());
        System.out.println("Trabajador: " + trabajador.nombre + ", Edad: " + trabajador.edad + ", Bonificación: " + trabajador.calcularBonificacion());
    }
}
