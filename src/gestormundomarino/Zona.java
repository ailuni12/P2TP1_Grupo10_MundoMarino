package gestormundomarino;

public class Zona extends Dato {
    public String nombre;
    public double extension;

    public Zona(int id, String nombre, double extension) {
        super(id);
        this.nombre = nombre;
        this.extension = extension;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
