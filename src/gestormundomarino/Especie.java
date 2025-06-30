package gestormundomarino;

public class Especie extends Dato {
    public String nombre;
    public String nombreCientifico;
    public String descripcion;
    public int idZona;

    public Especie(int id, String nombre, String nombreCientifico, String descripcion, int idZona) {
        super(id);
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.idZona = idZona;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
