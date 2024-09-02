package app;

import javax.swing.JOptionPane;

public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    public String puesto;

    public Empleado() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del Empleado: ");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: "));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));
        this.puesto = JOptionPane.showInputDialog("Ingrese el puesto del empelado: ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void asignarProyecto(Proyecto proyecto){
        JOptionPane.showMessageDialog(null, "El empleado " + this.nombre + " ha sido asignado al proyecto " + proyecto.getNombreProyecto());
    }
    
}
