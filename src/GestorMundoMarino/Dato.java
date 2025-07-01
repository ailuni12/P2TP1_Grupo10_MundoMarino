package GestorMundoMarino;

public abstract class Dato {
    protected int id;

    public Dato(int id) {
        this.id = id;
    }

    public abstract void mostrar();
}
