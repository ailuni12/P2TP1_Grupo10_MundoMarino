
package GestorMundoMarino;

import GestorMundoMarino.Dato;

public abstract class Empleado extends Dato {
    protected String nombre;
    protected String direccion;
    protected int telefono;

    public Empleado(int id, String nombre, String direccion, int telefono) {
        super(id);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public void mostrar() {
        System.out.println("Empleado ID: " + id + ", Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono);
    }
}


