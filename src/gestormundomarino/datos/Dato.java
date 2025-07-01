
package gestormundomarino.datos;

public abstract class Dato {
    public int id;

    public Dato(int id) {
        this.id = id;
    }

    public abstract void mostrar();
    
}
