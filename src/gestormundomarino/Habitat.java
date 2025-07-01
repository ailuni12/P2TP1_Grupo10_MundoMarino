
package gestormundomarino;

public class Habitat extends Dato {
    private final String nombre;
    private final String clima;
    private final String vegetacion;
    private final String continente;

    public Habitat(int id, String nombre, String clima, String vegetacion, String continente) {
        super(id);
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continente = continente;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getClima() { return clima; }
    public String getVegetacion() { return vegetacion; }
    public String getContinente() { return continente; }

    @Override
    public void mostrar() {
        System.out.printf(
            "Hábitat ID %d: %s%n" +
            "  Continente: %s%n" +
            "  Clima: %s%n" +
            "  Vegetación: %s%n",
            identificar(),
            nombre,
            continente,
            clima,
            vegetacion
        );
    }
    
}
