
package gestormundomarino.datos;

public abstract class Dato {
    //datos private final se asignan durante la creacion y no seran modificables
    //el atributo id simula ser un primary key para todos los objetos creados
    private final int id;

    public Dato(int id) {
        this.id = id;
    }

    public abstract void mostrar();
    
    //todas las subclases pueden usar este metodo
    public int identificar(){
        return id;
    }
    
}
