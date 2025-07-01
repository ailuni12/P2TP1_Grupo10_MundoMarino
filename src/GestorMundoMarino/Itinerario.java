
package GestorMundoMarino;

public class Itinerario extends Dato {
    private final String nombre;
    private final String descripcion;

    public Itinerario(int id, String nombre, String descripcion) {
        super(id);
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    @Override
    public void mostrar() {
        System.out.printf("Itinerario ID %d: %s - %s%n", identificar(), nombre, descripcion);
    }
}
