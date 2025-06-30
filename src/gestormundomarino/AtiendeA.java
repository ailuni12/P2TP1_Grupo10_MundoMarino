package gestormundomarino;

//Cuidador AtiendeA Especie

import java.time.LocalDate;

public class AtiendeA extends Dato {
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
}
