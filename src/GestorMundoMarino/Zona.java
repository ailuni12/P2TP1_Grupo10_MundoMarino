package GestorMundoMarino;

public class Zona extends Dato {
    private String nombre;
    private double superficie;

    public Zona(int id, String nombre, double superficie) {
        super(id);
        this.nombre = nombre;
        this.superficie = superficie;
    }

    @Override
    public void mostrar() {
        System.out.println("Zona ID: " + id + ", Nombre: " + nombre + ", Superficie: " + superficie);
    }
}

