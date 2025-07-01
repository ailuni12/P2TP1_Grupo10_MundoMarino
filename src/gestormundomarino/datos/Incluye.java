package gestormundomarino.datos;

//Zona Incluye Habitat
public class Incluye extends Dato {
    public int idZona;
    public int idHabitat;

    public Incluye(int id, int idZona, int idHabitat) {
        super(id);
        this.idZona = idZona;
        this.idHabitat = idHabitat;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
