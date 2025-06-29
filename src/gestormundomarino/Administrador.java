package gestormundomarino;

import java.time.LocalDate;


public class Administrador extends Empleado {
    public int idAdministrador;

    public Administrador(int idEmpleado, String nombre, String direccion, int telefono, LocalDate fechaIngreso, int idAdministrador) {
        super(idEmpleado, nombre, direccion, telefono, fechaIngreso);
        this.idAdministrador = idAdministrador;
    }

    public Administrador() {
    }
    
}
