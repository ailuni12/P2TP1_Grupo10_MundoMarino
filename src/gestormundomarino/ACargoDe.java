package gestormundomarino;


public class ACargoDe extends Dato {
    public int idGuia;
    public int idItinerario;

    public ACargoDe(int id, int idGuia, int idItinerario) {
        super(id);
        this.idGuia = idGuia;
        this.idItinerario = idItinerario;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
