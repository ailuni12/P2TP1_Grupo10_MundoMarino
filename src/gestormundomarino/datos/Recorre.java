package gestormundomarino.datos;

//Itinerario Recorre Zona
public class Recorre extends Dato {
    public int idItinerario;
    public int idZona;

    public Recorre(int id, int idItinerario, int idZona) {
        super(id);
        this.idItinerario = idItinerario;
        this.idZona = idZona;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
