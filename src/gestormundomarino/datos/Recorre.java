package gestormundomarino.datos;

//Itinerario Recorre Zona
<<<<<<< HEAD
public class Recorre extends Dato {
    public int idItinerario;
    public int idZona;
=======
//CLASE "RELACIONAL"

public class Recorre extends Dato {
    private int idItinerario;
    private int idZona;
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c

    public Recorre(int id, int idItinerario, int idZona) {
        super(id);
        this.idItinerario = idItinerario;
        this.idZona = idZona;
    }

<<<<<<< HEAD
    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
=======
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
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
}
