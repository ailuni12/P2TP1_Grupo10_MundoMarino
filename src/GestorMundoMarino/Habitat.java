package GestorMundoMarino;

public class Habitat extends Dato {
    private String nombre;
    private String clima;
    private String alimento;
    private String ubicacion;

    public Habitat(int id, String nombre, String clima, String alimento, String ubicacion) {
        super(id);
        this.nombre = nombre;
        this.clima = clima;
        this.alimento = alimento;
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrar() {
        System.out.println("Habitat ID: " + id + ", Nombre: " + nombre + ", Clima: " + clima + ", Alimento: " + alimento + ", Ubicación: " + ubicacion);
    }
}
