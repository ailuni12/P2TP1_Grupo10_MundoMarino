package gestormundomarino;

//Especie Habita Habitat
//CLASE "RELACIONAL"

public class Habita extends Dato {
    private int idEspecie;
    private int idHabitat;

    public Habita(int id, int idEspecie, int idHabitat) {
        super(id);
        this.idEspecie = idEspecie;
        this.idHabitat = idHabitat;
    }

    @Override
    public void mostrar() {
        System.out.printf(
            "Relacion ID %d: La especie (ID %d) reside en el habitat (ID %d)%n",
            identificar(),
            idEspecie,
            idHabitat
        );
    }
}
