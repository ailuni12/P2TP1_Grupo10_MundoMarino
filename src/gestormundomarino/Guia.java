package gestormundomarino;

import java.time.LocalDate;


public class Guia extends Empleado {

    public Guia(int id, String nombre, String direccion, int telefono, LocalDate fechaIngreso, int idGuia) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }
    
}
