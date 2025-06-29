package gestormundomarino;

import java.time.LocalDate;


public class Cuidador extends Empleado {
    public int idCuidador;

    public Cuidador(int idEmpleado, String nombre, String direccion, int telefono, LocalDate fechaIngreso, int idCuidador) {
        super(idEmpleado, nombre, direccion, telefono, fechaIngreso);
        this.idCuidador=idCuidador;
    }

    public Cuidador() {
    }
    
}
