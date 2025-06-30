package gestormundomarino;

import java.time.LocalDate;


public class Cuidador extends Empleado {

    public Cuidador(int id, String nombre, String direccion, int telefono, LocalDate fechaIngreso, int idCuidador) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }
    
}
