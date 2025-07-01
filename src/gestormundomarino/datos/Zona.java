package gestormundomarino.datos;

public class Zona extends Dato {
<<<<<<< HEAD
    public String nombre;
    public double extension;
=======
    private final String nombre;
    private final double extension;
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c

    public Zona(int id, String nombre, double extension) {
        super(id);
        this.nombre = nombre;
        this.extension = extension;
    }
<<<<<<< HEAD

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
=======
    
    //getters
    public String getNombre() { return nombre; }
    public double getExtension() { return extension; }

    @Override
    public void mostrar() {
            System.out.printf(
            "Zona ID %d: %s (Extensión: %.2f km²)%n",
            identificar(),
            nombre,
            extension
        );
    }
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
}
