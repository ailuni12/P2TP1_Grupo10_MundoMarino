package gestormundomarino.datos.empleado;

import java.time.LocalDate;


public class Administrador extends Empleado {

    public Administrador(int id, String nombre, String direccion, int telefono, LocalDate fechaIngreso, int idAdministrador) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }
    
}
