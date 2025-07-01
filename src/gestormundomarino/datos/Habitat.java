
package gestormundomarino.datos;

public class Habitat extends Dato {
    public String nombre;
    public String clima;
    public String vegetacion;
    public String continente;

    public Habitat(int id, String nombre, String clima, String vegetacion, String continente) {
        super(id);
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continente = continente;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
