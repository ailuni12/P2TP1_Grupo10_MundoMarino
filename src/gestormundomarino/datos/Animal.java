//clase que relaciona habitat-zona-especie
package gestormundomarino.datos;

public class Animal extends Dato {
<<<<<<< HEAD
    public int idEspecie;
    public int idHabitat;
    public int idCuidador;
    
    public String nombre;
    public String descripcion;

    public Animal(int id, int idEspecie, int idHabitat, int idCuidador, String nombre, String descripcion) {
        super(id);
        this.idEspecie = idEspecie;
        this.idHabitat = idHabitat;
        this.idCuidador = idCuidador;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
=======
    //datos private final se asignan durante la creacion y no seran modificables
    private final int idEspecie;
    private final int idHabitat;
    private final String nombre;

    public Animal(int id, int idEspecie, int idHabitat, String nombre) {
        super(id);
        this.idEspecie = idEspecie;
        this.idHabitat = idHabitat;
        this.nombre = nombre;
    }

    // getters
    public int getIdEspecie() { return idEspecie; }
    public int getIdHabitat() { return idHabitat; }
    public String getNombre() { return nombre; }

    @Override
    public void mostrar() {
        System.out.printf(
            "Animal ID:%d, Nombre:%s, Especie:%d, Habitat:%d",
            identificar(), nombre, idEspecie, idHabitat
        );
    }
}
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
