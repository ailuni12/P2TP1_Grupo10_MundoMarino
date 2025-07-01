//clase que relaciona habitat-zona-especie
package gestormundomarino.datos;

public class Animal extends Dato {
    public int idEspecie;
    public int idHabitat;
    public int idCuidador;
    
    public String nombre;
    public String descripcion;

    public Animal(int id, int idEspecie, int idHabitat, int idCuidador, String nombre, String descripcion) {
        super(id);
        this.idEspecie = idEspecie;
        this.idHabitat = idHabitat;
        this.idCuidador = idCuidador;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
