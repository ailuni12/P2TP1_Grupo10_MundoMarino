package gestormundomarino;

import java.time.LocalDate;

public abstract class Empleado extends Dato {
    private final String nombre;
    private final String direccion;
    private final int telefono;
    private final LocalDate fechaIngreso;

    public Empleado(int id, String nombre, String direccion, int telefono) {
        super(id);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = LocalDate.now();
    }

    // Getters - available to all subclasses
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public int getTelefono() { return telefono; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }

    @Override
    public abstract void mostrar();
}
