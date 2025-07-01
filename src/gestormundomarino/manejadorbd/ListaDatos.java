package gestormundomarino.manejadorbd;

import gestormundomarino.datos.Dato;
import java.lang.reflect.Field;
import java.util.ArrayList;

class ListaDatos {
    private String nombre;
    private ArrayList<Dato> listaDatos;

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getFilaEncabezadoAL() {// adaptado de https://www.baeldung.com/java-reflection
        ArrayList<String> nombres = new ArrayList<>();
        Field[] campos = Dato.class.getDeclaredFields();
        for(Field campo : campos) {
            nombres.add(campo.getName());
        }
        return nombres;
    }

    public ArrayList<Dato> getListaDatos() {
        return listaDatos;
    }

    public int agregarDato(Dato dato) {
        int res = 0;
        if(listaDatos.add(dato)){
            res = 1;
        }
        return res;
    }

    public int eliminarDato(String id) {
        int i, res = 0;
        for(i = 0; i < listaDatos.size(); i++) {       // recorrer listaDatos completo (para id no haría falta)
            if(listaDatos.get(i).getId(0).equals(id)) {  // verificar su primer campo, id
                listaDatos.remove(i);                  // eliminar el elemento de índice i
                res++;                              // contar el número de elementos eliminados
            }
        }
        return res;
    }

    public int modificarCampo(String nombreColumna, String id, String valor) {
        int i = 0, res = 0;
        int idColumna = filaEncabezadoAL.indexOf(nombreColumna);// hallar el índice correspondiente a nombreColumna
        Dato fila = null;

        while(i < listaDatos.size() && res == 0) {     // recorrer listaDatos
            fila = listaDatos.get(i);                  // obtener la fila de índice i
            if(fila.get(0).equals(id)) {            // verificar su primer campo, id
                fila.modificar(idColumna, valor);   // modificar el valor de fila en índice idColumma
                res = 1;
            }
        }
        return res;
    }
}
