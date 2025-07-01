package gestormundomarino.datos;

//Especie Habita Habitat
<<<<<<< HEAD
public class Habita extends Dato {
    public int idEspecie;
    public int idHabitat;
=======
//CLASE "RELACIONAL"

public class Habita extends Dato {
    private int idEspecie;
    private int idHabitat;
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c

    public Habita(int id, int idEspecie, int idHabitat) {
        super(id);
        this.idEspecie = idEspecie;
        this.idHabitat = idHabitat;
    }

    @Override
    public void mostrar() {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
        System.out.printf(
            "Relacion ID %d: La especie (ID %d) reside en el habitat (ID %d)%n",
            identificar(),
            idEspecie,
            idHabitat
        );
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
    }
}
