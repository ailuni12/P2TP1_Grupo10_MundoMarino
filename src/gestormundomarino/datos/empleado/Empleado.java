package gestormundomarino.datos.empleado;

import gestormundomarino.datos.Dato;
import java.time.LocalDate;

public class Empleado extends Dato {
<<<<<<< HEAD
    public String nombre;
    public String direccion;
    public int telefono;
    public LocalDate fechaIngreso;

    public Empleado(int id, String nombre, String direccion, int telefono, LocalDate fechaIngreso) {
=======
    private final String nombre;
    private final String direccion;
    private final int telefono;
    private final LocalDate fechaIngreso;

    public Empleado(int id, String nombre, String direccion, int telefono) {
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
        super(id);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
<<<<<<< HEAD
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
=======
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

>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
}
