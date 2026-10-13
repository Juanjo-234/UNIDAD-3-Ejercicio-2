//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Empleado empleado = new Empleado("Carlos Pérez", "34567890", 1200.0);

    System.out.println("Empleado: " + empleado.getNombre() + " | Salario inicial: " + empleado.getSalario());

    System.out.println("\n--- Pruebas de Actualización Salarial ---");
    empleado.actualizarSalario(15.0);
    empleado.actualizarSalario(-5.0);

    System.out.println("\n--- Estado Final ---");
    System.out.println("Salario final: " + empleado.getSalario());
}
