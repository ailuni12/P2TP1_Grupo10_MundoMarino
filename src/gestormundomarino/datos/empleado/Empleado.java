package gestormundomarino.datos.empleado;

import gestormundomarino.datos.Dato;
import java.time.LocalDate;

public class Empleado extends Dato {
    private final String nombre;
    private final String direccion;
    private final int telefono;
    private final LocalDate fechaIngreso;

    public Empleado(int id, String nombre, String direccion, int telefono) {
        super(id);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        //para la fecha de ingreso se toma el momento de creacion del objeto
        this.fechaIngreso = LocalDate.now();
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public int getTelefono() { return telefono; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }

    @Override
    public void mostrar() {
        System.out.println("Empleado del parque.");
    }
}
