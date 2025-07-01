package gestormundomarino;

public class Administrador extends Empleado {

    public Administrador(int id, String nombre, String direccion, int telefono) {
        super(id, nombre, direccion, telefono);
    }

    @Override
    public void mostrar() {
        System.out.printf(
            "Administrador ID %d: %s%n" +
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
