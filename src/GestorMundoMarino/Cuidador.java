package GestorMundoMarino;

public class Cuidador extends Empleado {

    public Cuidador(int id, String nombre, String direccion, int telefono) {
        super(id, nombre, direccion, telefono);
    }

    public void mostrar() {
        System.out.println("Cuidador:");
        super.mostrar();
    }
}
