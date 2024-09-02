package app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proyecto {
    public String nombreProyecto;
    public double presupuesto;
    public String fechaInicio;
    public String fechaFin;
    private ArrayList<Empleado> empleadosAsignados;

    public Proyecto() {
        this.nombreProyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto: ");
        this.presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto del proyecto: "));
        this.fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio del Proyecto: ");
        this.fechaFin = JOptionPane.showInputDialog("Ingrese la fecha fin del proyecto: ");
        this.empleadosAsignados = new ArrayList<>();
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    // Método para asignar empleado
    public void asignarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado " + empleado.getNombre() + " ha sido asignado al proyecto " + this.nombreProyecto);
    }

    // Método para mostrar empleados asignados
    public void mostrarEmpleadosAsignados() {
        StringBuilder listaEmpleados = new StringBuilder("Empleados asignados al proyecto " + this.nombreProyecto + ":\n");
        for (Empleado e : empleadosAsignados) {
            listaEmpleados.append("- ").append(e.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaEmpleados.toString());
    }
    
    
    
}
