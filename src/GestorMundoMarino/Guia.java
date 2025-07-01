package GestorMundoMarino;

public class Guia extends Empleado {

    public Guia(int id, String nombre, String direccion, int telefono) {
        super(id, nombre, direccion, telefono);
    }

    public void mostrar() {
        System.out.println("Guía:");
        super.mostrar();
    }
}
