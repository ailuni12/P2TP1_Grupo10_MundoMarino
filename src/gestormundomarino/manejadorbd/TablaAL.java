package gestormundomarino.manejadorbd;

import java.util.ArrayList;

class TablaAL {
    private String nombre;
    private ArrayList<String> filaEncabezadoAL;
    private ArrayList<FilaAL> filasAL;

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getFilaEncabezadoAL() {
        return filaEncabezadoAL;
    }

    public ArrayList<FilaAL> getFilasAL() {
        return filasAL;
    }

    public void agregarFila(FilaAL fila) {
        filasAL.add(fila);
    }
}