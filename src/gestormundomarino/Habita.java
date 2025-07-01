package gestormundomarino;

//Especie Habita Habitat
//CLASE "RELACIONAL"

public class Habita extends Dato {
    public int idEspecie;
    public int idHabitat;

    public Habita(int id, int idEspecie, int idHabitat) {
        super(id);
        this.idEspecie = idEspecie;
        this.idHabitat = idHabitat;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
