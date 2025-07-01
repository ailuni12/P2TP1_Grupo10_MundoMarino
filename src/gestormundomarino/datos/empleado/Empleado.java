package gestormundomarino.datos.empleado;

import gestormundomarino.datos.Dato;
import java.time.LocalDate;

public class Empleado extends Dato {
    public String nombre;
    public String direccion;
    public int telefono;
    public LocalDate fechaIngreso;

    public Empleado(int id, String nombre, String direccion, int telefono, LocalDate fechaIngreso) {
        super(id);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
