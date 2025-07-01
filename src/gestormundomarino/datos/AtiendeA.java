package gestormundomarino.datos;

//Cuidador AtiendeA Especie
<<<<<<< HEAD
=======
//CLASE "RELACIONAL"
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c

import java.time.LocalDate;

public class AtiendeA extends Dato {
<<<<<<< HEAD
    public int idCuidador;
    public int idEspecie;
    public LocalDate fechaInicio;

    public AtiendeA(int id, int idCuidador, int idEspecie, LocalDate fechaInicio) {
        super(id);
        this.idCuidador = idCuidador;
        this.idEspecie = idEspecie;
        this.fechaInicio = fechaInicio;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
=======
    private int idCuidador;
    private int idAnimal;
    private LocalDate fechaInicio;

    public AtiendeA(int id, int idCuidador, int idAnimal, LocalDate fechaInicio) {
        super(id);
        this.idCuidador = idCuidador;
        this.idAnimal = idAnimal;
        this.fechaInicio = fechaInicio;
    }
    
    public void asignar(int idCuidador, int idAnimal, LocalDate fechaDeAsignacion){
        this.idCuidador = idCuidador;
        this.idAnimal = idAnimal;
        this.fechaInicio = fechaDeAsignacion;
    }

    @Override
    public void mostrar() {
    System.out.printf(
        "Relacion ID %d: Animal (ID %d) es atendido por Cuidador (ID %d) desde %s%n",
        identificar(),
        idAnimal,
        idCuidador,
        fechaInicio.toString()
    );
}
>>>>>>> 87dee340a64b0f4f41aadc8ffc909ad15d554f6c
}
