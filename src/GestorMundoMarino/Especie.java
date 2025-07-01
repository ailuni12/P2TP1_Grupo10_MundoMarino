package GestorMundoMarino;

public class Especie extends Dato {
    private String nombreComun;
    private String nombreCientifico;
    private String descripcion;
    private int idHabitat;

    public Especie(int id, String nombreComun, String nombreCientifico, String descripcion, int idHabitat) {
        super(id);
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.idHabitat = idHabitat;
    }

    @Override
    public void mostrar() {
        System.out.println("Especie ID: " + id + ", Nombre común: " + nombreComun + ", Nombre científico: " + nombreCientifico + ", Descripción: " + descripcion + ", Habitat ID: " + idHabitat);
    }
}
