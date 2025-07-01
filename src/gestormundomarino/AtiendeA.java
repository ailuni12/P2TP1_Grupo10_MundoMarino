package gestormundomarino;

//Cuidador AtiendeA Especie
//CLASE "RELACIONAL"

import java.time.LocalDate;

public class AtiendeA extends Dato {
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
        "Relación ID %d: Animal (ID %d) es atendido por Cuidador (ID %d) desde %s%n",
        identificar(),
        idAnimal,
        idCuidador,
        fechaInicio.toString()
    );
}
}
