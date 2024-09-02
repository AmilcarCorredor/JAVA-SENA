package app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Departamento {
    public String nombreDepartamento;
    public String ubicacion;
    private ArrayList<Empleado> empleados;

    public Departamento() {
        this.nombreDepartamento = JOptionPane.showInputDialog("Ingrese el nombre del departamento: ");
        this.ubicacion = JOptionPane.showInputDialog("Ingrese la ubicacion de la oficina: ");
        this.empleados = new ArrayList<>();
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    // Método para agregar empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado " + empleado.getNombre() + " agregado al departamento " + this.nombreDepartamento);
    }

    // Método para mostrar empleados
    public void mostrarEmpleados() {
        StringBuilder listaEmpleados = new StringBuilder("Empleados en el departamento " + this.nombreDepartamento + ":\n");
        for (Empleado e : empleados) {
            listaEmpleados.append("- ").append(e.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaEmpleados.toString());
    }
    
    
}
