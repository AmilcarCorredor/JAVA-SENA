package app;

public class Principal {
    public static void main(String[] args) {
        
        
        // Crear empleados
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        // Crear departamento y asignar empleados
        Departamento departamento = new Departamento();
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        // Mostrar empleados del departamento
        departamento.mostrarEmpleados();

        // Crear proyecto y asignar empleados
        Proyecto proyecto = new Proyecto();
        proyecto.asignarEmpleado(empleado1);
        proyecto.asignarEmpleado(empleado2);

        // Mostrar empleados asignados al proyecto
        proyecto.mostrarEmpleadosAsignados();
    }
}
