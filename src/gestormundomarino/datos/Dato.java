
package gestormundomarino.datos;

public abstract class Dato {
<<<<<<< HEAD
    public int id;
=======
    //datos private final se asignan durante la creacion y no seran modificables
    //el atributo id simula ser un primary key para todos los objetos creados
    private final int id;
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c

    public Dato(int id) {
        this.id = id;
    }

    public abstract void mostrar();
    
<<<<<<< HEAD
=======
    //todas las subclases pueden usar este metodo
    public int identificar(){
        return id;
    }
    
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
}
