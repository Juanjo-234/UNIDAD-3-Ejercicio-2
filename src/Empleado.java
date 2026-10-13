public class Empleado {
    private String nombre;
    private String dni;
    private double salario;

    public Empleado(String nombre, String dni, double salarioInicial) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = Math.max(salarioInicial, 0.0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            salario += salario * (porcentajeAumento / 100.0);
            System.out.println("Actualización exitosa. Nuevo salario: " + salario);
        } else {
            System.out.println("Error: El porcentaje de aumento debe ser mayor a cero.");
        }
    }
}
