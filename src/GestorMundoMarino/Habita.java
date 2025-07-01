package GestorMundoMarino;

//Especie Habita Habitat

public class Habita extends Dato {
    private final int idEspecie;
    private final int idHabitat;

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
