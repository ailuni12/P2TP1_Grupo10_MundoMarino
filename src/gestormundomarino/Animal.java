//clase que relaciona habitat-zona-especie
package gestormundomarino;

public class Animal extends Dato {
    public int idEspecie;
    public int idHabitat;
    public int idCuidador;
    
    public String nombre;
    public String descripcion;

    public Animal(int idEspecie, int idHabitat, int idCuidador, String nombre, String descripcion) {
        this.idEspecie = idEspecie;
        this.idHabitat = idHabitat;
        this.idCuidador = idCuidador;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Animal() {
    }

    
}
