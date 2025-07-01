package gestormundomarino.datos;

//Itinerario ACargoDe Guia
//CLASE "RELACIONAL"

public class ACargoDe extends Dato {
    private int idGuia;
    private int idItinerario;

    public ACargoDe(int id, int idGuia, int idItinerario) {
        super(id);
        this.idGuia = idGuia;
        this.idItinerario = idItinerario;
    }

    // Getters
    public int getIdGuia() { return idGuia; }
    public int getIdItinerario() { return idItinerario; }

    // Setter
    public void asignar(int idGuia, int idItinerario) {
        this.idGuia = idGuia;
        this.idItinerario = idItinerario;
    }

    @Override
    public void mostrar() {
        System.out.printf(
            "Relacion ID %d: Itinerario (ID %d) esta a cargo de Guia (ID %d)%n",
            identificar(),
            idItinerario,
            idGuia
        );
    }
}
