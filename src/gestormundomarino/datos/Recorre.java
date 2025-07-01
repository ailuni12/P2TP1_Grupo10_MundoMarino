package gestormundomarino.datos;

//Itinerario Recorre Zona
//CLASE "RELACIONAL"

public class Recorre extends Dato {
    private int idItinerario;
    private int idZona;

    public Recorre(int id, int idItinerario, int idZona) {
        super(id);
        this.idItinerario = idItinerario;
        this.idZona = idZona;
    }

    // Getters
    public int getIdItinerario() { return idItinerario; }
    public int getIdZona() { return idZona; }

    // Setter
    public void asignar(int idItinerario, int idZona) {
        this.idItinerario = idItinerario;
        this.idZona = idZona;
    }

    @Override
    public void mostrar() {
        System.out.printf(
            "Relación ID %d: Itinerario (ID %d) recorre Zona (ID %d)%n",
            identificar(),
            idItinerario,
            idZona
        );
    }
}
