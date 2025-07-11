package gestormundomarino.datos;

public class Zona extends Dato {
    private final String nombre;
    private final double extension;

    public Zona(int id, String nombre, double extension) {
        super(id);
        this.nombre = nombre;
        this.extension = extension;
    }
    
    //getters
    public String getNombre() { return nombre; }
    public double getExtension() { return extension; }

    @Override
    public void mostrar() {
            System.out.printf(
            "Zona ID %d: %s (Extension: %.2f km)%n",
            identificar(),
            nombre,
            extension
        );
    }
}
