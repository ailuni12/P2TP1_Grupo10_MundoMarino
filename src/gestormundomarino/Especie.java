package gestormundomarino;

public class Especie extends Dato {
    //datos private final se asignan durante la creacion y no seran modificables
    private final String nombre;
    private final String nombreCientifico;
    private final String descripcion;

    public Especie(int id, String nombre, String nombreCientifico, String descripcion, int idZona) {
        super(id);
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getNombreCientifico() { return nombreCientifico; }
    public String getDescripcion() { return descripcion; }

    @Override
    public void mostrar() {
        System.out.printf(
            "Especie ID %d: %s (%s)%n" +
            "  Descripción: %s%n",
            identificar(),
            nombre,
            nombreCientifico,
            descripcion
        );
    }
}
