package GestorMundoMarino;

public class Animal extends Dato {
    private int idEspecie;
    private int idZona;
    private String nombre;

    public Animal(int id, int idEspecie, int idZona, String nombre) {
        super(id);
        this.idEspecie = idEspecie;
        this.idZona = idZona;
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Animal ID: " + id + ", Especie ID: " + idEspecie + ", Zona ID: " + idZona + ", Nombre: " + nombre);
    }
}
