package GestorMundoMarino;

public class Recorre extends Dato {
    private int idItinerario;
    private int idZona;

    public Recorre(int id, int idItinerario, int idZona) {
        super(id);
        this.idItinerario = idItinerario;
        this.idZona = idZona;
    }

    public int getIdItinerario() { return idItinerario; }
    public int getIdZona() { return idZona; }

    public void asignar(int idItinerario, int idZona) {
        this.idItinerario = idItinerario;
        this.idZona = idZona;
    }

    @Override
    public void mostrar() {
        System.out.printf(
            "Relación ID %d: Itinerario (ID %d) recorre Zona (ID %d)%n",
            id,
            idItinerario,
            idZona
        );
    }
}
