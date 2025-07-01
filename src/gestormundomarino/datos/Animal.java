//clase que relaciona habitat-zona-especie
package gestormundomarino.datos;

public class Animal extends Dato {
    //datos private final se asignan durante la creacion y no seran modificables
    private final int idEspecie;
    private final int idHabitat;
    private final String nombre;

    public Animal(int id, int idEspecie, int idHabitat, String nombre) {
        super(id);
        this.idEspecie = idEspecie;
        this.idHabitat = idHabitat;
        this.nombre = nombre;
    }

    // getters
    public int getIdEspecie() { return idEspecie; }
    public int getIdHabitat() { return idHabitat; }
    public String getNombre() { return nombre; }

    @Override
    public void mostrar() {
        System.out.printf(
            "Animal ID:%d, Nombre:%s, Especie:%d, Habitat:%d",
            identificar(), nombre, idEspecie, idHabitat
        );
    }
}
