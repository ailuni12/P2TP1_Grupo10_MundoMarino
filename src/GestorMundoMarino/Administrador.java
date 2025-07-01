package GestorMundoMarino;

public class Administrador extends Empleado {

    public Administrador(int id, String nombre, String direccion, int telefono) {
        super(id, nombre, direccion, telefono);
    }

    @Override
    public void mostrar() {
        System.out.println("Administrador:");
        super.mostrar();
    }
}
