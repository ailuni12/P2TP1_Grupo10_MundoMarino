package gestormundomarino.datos;

<<<<<<< HEAD

public class ACargoDe extends Dato {
    public int idGuia;
    public int idItinerario;
=======
//Itinerario ACargoDe Guia
//CLASE "RELACIONAL"

public class ACargoDe extends Dato {
    private int idGuia;
    private int idItinerario;
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c

    public ACargoDe(int id, int idGuia, int idItinerario) {
        super(id);
        this.idGuia = idGuia;
        this.idItinerario = idItinerario;
    }

<<<<<<< HEAD
    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
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
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
    }
}
