
package gestormundomarino;

public class Habitat extends Dato {
    public int idHabitat;
    public String nombre;
    public String clima;
    public String vegetacion;
    public String continente;

    public Habitat(int idHabitat, String nombre, String clima, String vegetacion, String continente) {
        this.idHabitat = idHabitat;
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continente = continente;
    }

    public Habitat() {
    }
    
}
