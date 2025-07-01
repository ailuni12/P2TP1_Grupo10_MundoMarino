package gestormundomarino.datos;

import java.time.LocalTime;


public class Itinerario extends Dato {
    public String descRecorrido;
    public double longitud; //distancia en km
    public int maxVisitantes;
    public int numEspecies;
    public LocalTime horaInicio;
    public LocalTime horaFin;

    public Itinerario(int id, String descRecorrido, double longitud, int maxVisitantes) {
        super(id);
        this.descRecorrido = descRecorrido;
        this.longitud = longitud;
        this.maxVisitantes = maxVisitantes;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
