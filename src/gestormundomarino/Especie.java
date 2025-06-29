package gestormundomarino;

public class Especie {
    public int idEspecie;
    public String nombre;
    public String nombreCientifico;
    public String descripcion;
    public int idZona;

    public Especie(int idEspecie, String nombre, String nombreCientifico, String descripcion, int idZona) {
        this.idEspecie = idEspecie;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.idZona = idZona;
    }

    public Especie() {
    }
    
    
}
