package gestormundomarino;

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