package gestormundomarino.datos.empleado;

<<<<<<< HEAD
import java.time.LocalDate;


public class Cuidador extends Empleado {

    public Cuidador(int id, String nombre, String direccion, int telefono, LocalDate fechaIngreso, int idCuidador) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }
    
}
=======
public class Cuidador extends Empleado {

    public Cuidador(int id, String nombre, String direccion, int telefono) {
        super(id, nombre, direccion, telefono);
    }

    @Override
    public void mostrar() {
        System.out.printf(
            "Cuidador ID %d: %s%n" +
            "  Contacto: %s | Tel: %d%n" +
            "  Fecha ingreso: %s%n",
            identificar(),
            getNombre(),
            getDireccion(),
            getTelefono(),
            getFechaIngreso().toString()
        );
    }
}
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
