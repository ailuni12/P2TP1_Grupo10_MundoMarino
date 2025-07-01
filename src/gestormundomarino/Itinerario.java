package gestormundomarino;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Itinerario extends Dato {
    private final String descRecorrido;
    private final double longitud; // distancia en km
    private final int maxVisitantes;
    private int numEspecies;
    private final LocalTime horaInicio;
    private final LocalTime horaFin;

    public Itinerario(int id, String descRecorrido, double longitud, int maxVisitantes, 
                     int numEspecies, LocalTime horaInicio, LocalTime horaFin) {
        super(id);
        this.descRecorrido = descRecorrido;
        this.longitud = longitud;
        this.maxVisitantes = maxVisitantes;
        this.numEspecies = numEspecies;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    // Getters
    public String getDescRecorrido() { return descRecorrido; }
    public double getLongitud() { return longitud; }
    public int getMaxVisitantes() { return maxVisitantes; }
    public int getNumEspecies() { return numEspecies; }
    public LocalTime getHoraInicio() { return horaInicio; }
    public LocalTime getHoraFin() { return horaFin; }

    @Override
    public void mostrar() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.printf(
            "Itinerario ID %d: %s%n" +
            "  Distancia: %.2f km | Especies: %d%n" +
            "  Capacidad: %d visitantes%n" +
            "  Horario: %s a %s%n",
            identificar(),
            descRecorrido,
            longitud,
            numEspecies,
            maxVisitantes,
            horaInicio.format(timeFormatter),
            horaFin.format(timeFormatter)
        );
    }
}