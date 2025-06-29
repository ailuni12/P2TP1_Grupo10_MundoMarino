package gestormundomarino;

import java.time.LocalDate;


public class Guia extends Empleado {
    public int idGuia;

    public Guia(int idEmpleado, String nombre, String direccion, int telefono, LocalDate fechaIngreso, int idGuia) {
        super(idEmpleado, nombre, direccion, telefono, fechaIngreso);
        this.idGuia=idGuia;
    }

    public Guia() {
    }
    
}
