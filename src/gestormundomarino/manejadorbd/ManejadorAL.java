package gestormundomarino.manejadorbd;

import gestormundomarino.datos.Dato;
import java.util.ArrayList;
import java.util.Map;

public class ManejadorAL {
    private Map<String, TablaAL> tablasAL;
    public void alta(String nombreTabla, String nombreColumna, Dato dato) {
        int res;
        TablaAL tabla = tablasAL.get(nombreTabla);

        if(tabla != null) {// si se halló la tabla
            res = tabla.agregarFila(new FilaAL(dato.listar());// si se agregó la fila, devuelve 1
            if(res == 1){
                System.out.println("Se agregó un registro a la tabla.");
            } else {
                System.out.println("No se pudo agregar el registro a la tabla.");
            }
        } else {
            System.out.println("No se halló la tabla.");
        }
    }
    public void baja(String nombreTabla, String nombreColumna, String id) {
        int res;
        TablaAL tabla = tablasAL.get(nombreTabla);
        
        if(tabla != null) {// si se halló la tabla
            res = tabla.deleteFilaAL(id);// devuelve la cantidad de registros eliminados (para id, debería ser 1)
            if(res > 0) {
                System.out.println("Se eliminó el registro de id: " + id);
            } else {
                System.out.println("No se pudo eliminar el registro de id: " + id);
            }
        } else {
            System.out.println("No se halló la tabla.");
        }
    }
    public void modif(String nombreTabla, String nombreColumna, String id, String valor) {
        int res;
        TablaAL tabla = tablasAL.get(nombreTabla);
        
        if(tabla != null) {
            res = tabla.modificarCampo(nombreColumna, id, valor);
            if(res == 1){
                ;
            }
        } else {
            System.out.println("No se halló la tabla.");
        }
    }
    
    /**
     * Método que busca un valor (String) en una columna de una tabla (TablaAL).
     * 1- halla la tabla según su nombre.
     * 2- halla el índice correspondiente a la columna según su nombre.
     * 3- busca el valor en las filas (filasAL de TablaAL) según el índice.
     * 4- devuelve las filas halladas (un ArrayList de tipo FilaAL).
     * 
     * @param nombreTabla nombre de la tabla a consultar (TablaAL)
     * @param nombreColumna nombre de la columna en la que buscar (índice de 
     *                      filaEncabezadoAL aplicado a filasAL)
     * @param valor valor buscado que determina la(s) fila(s) a hallar (FilaAL)
     * @return fila(s) hallada(s) o ArrayList vacío (ArrayList de FilaAL)
     */
    public ArrayList<FilaAL> consulta(String nombreTabla, String nombreColumna, String valor) {
        TablaAL tabla = tablasAL.get(nombreTabla);// **1**
        ArrayList<String> encabezados = tabla.getFilaEncabezadoAL();// **2**
        int iEncabezado = encabezados.indexOf(nombreColumna);// **3**
        ArrayList<FilaAL> filas = tabla.getFilasAL();
        ArrayList<FilaAL> filasResultado = new ArrayList<>();

        for (FilaAL fila : filas) {
            if(fila.get(iEncabezado).equals(valor)) {
                filasResultado.add(fila);
            }
        }
        return filasResultado;// **4**
    }
    public ArrayList<FilaAL> consulta(String nombreTabla, String nombreColumna, Integer valor) {
        return consulta(nombreTabla, nombreColumna, valor.toString());
    }
}