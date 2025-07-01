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

    public int agregarFila(FilaAL fila) {
        int res = 0;
        if(filasAL.add(fila)){
            res = 1;
        }
        return res;
    }

    public int deleteFilaAL(String id) {
        int i, res = 0;
        for(i = 0; i < filasAL.size(); i++) {       // recorrer filasAL completo (para id no haría falta)
            if(filasAL.get(i).get(0).equals(id)) {  // verificar su primer campo, id
                filasAL.remove(i);                  // eliminar el elemento de índice i
                res++;                              // contar el número de elementos eliminados
            }
        }
        return res;
    }

    public int modificarCampo(String nombreColumna, String id, String valor) {
        int i = 0, res = 0;
        int idColumna = filaEncabezadoAL.indexOf(nombreColumna);// hallar el índice correspondiente a nombreColumna
        FilaAL fila = null;

        while(i < filasAL.size() && res == 0) {     // recorrer filasAL
            fila = filasAL.get(i);                  // obtener la fila de índice i
            if(fila.get(0).equals(id)) {            // verificar su primer campo, id
                fila.modificar(idColumna, valor);   // modificar el valor de fila en índice idColumma
                res = 1;
            }
        }
        return res;
    }
}
