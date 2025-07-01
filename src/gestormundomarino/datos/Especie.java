package gestormundomarino.datos;

public class Especie extends Dato {
<<<<<<< HEAD
    public String nombre;
    public String nombreCientifico;
    public String descripcion;
    public int idZona;
=======
    //datos private final se asignan durante la creacion y no seran modificables
    private final String nombre;
    private final String nombreCientifico;
    private final String descripcion;
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c

    public Especie(int id, String nombre, String nombreCientifico, String descripcion, int idZona) {
        super(id);
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
<<<<<<< HEAD
        this.idZona = idZona;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
=======
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getNombreCientifico() { return nombreCientifico; }
    public String getDescripcion() { return descripcion; }

    @Override
    public void mostrar() {
        System.out.printf(
            "Especie ID %d: %s (%s)%n" +
            "  Descripcion: %s%n",
            identificar(),
            nombre,
            nombreCientifico,
            descripcion
        );
    }
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
}
