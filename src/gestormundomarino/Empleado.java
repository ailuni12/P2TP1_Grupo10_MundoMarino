package gestormundomarino;

import java.time.LocalDate;

public class Empleado extends Dato {
    public int idEmpleado;
    public String nombre;
    public String direccion;
    public int telefono;
    public LocalDate fechaIngreso;

    public Empleado(int idEmpleado, String nombre, String direccion, int telefono, LocalDate fechaIngreso) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    public Empleado() {
    }
    
    
}
