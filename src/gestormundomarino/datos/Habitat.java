
package gestormundomarino.datos;

public class Habitat extends Dato {
<<<<<<< HEAD
    public String nombre;
    public String clima;
    public String vegetacion;
    public String continente;
=======
    private final String nombre;
    private final String clima;
    private final String vegetacion;
    private final String continente;
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c

    public Habitat(int id, String nombre, String clima, String vegetacion, String continente) {
        super(id);
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continente = continente;
    }

<<<<<<< HEAD
    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
    // Getters
    public String getNombre() { return nombre; }
    public String getClima() { return clima; }
    public String getVegetacion() { return vegetacion; }
    public String getContinente() { return continente; }

    @Override
    public void mostrar() {
        System.out.printf(
            "Habitat ID %d: %s%n" +
            "  Continente: %s%n" +
            "  Clima: %s%n" +
            "  Vegetacion: %s%n",
            identificar(),
            nombre,
            continente,
            clima,
            vegetacion
        );
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
    }
    
}
