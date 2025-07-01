package gestormundomarino.manejadorbd;

import gestormundomarino.datos.Dato;
import java.util.ArrayList;
import java.util.Map;

public class ManejadorDatos {
    private Map<String, ListaDatos> listasDatos;
    
    public void alta(String nombreLista, Dato dato) {
        int res;
        ListaDatos lista = listasDatos.get(nombreLista);

        if(lista != null) {// si se halló la lista
            res = lista.agregarDato(dato);// si se agregó la fila, devuelve 1
            if(res == 1){
                System.out.println("Se agregó un registro a la lista.");
            } else {
                System.out.println("No se pudo agregar el registro a la lista.");
            }
        } else {
            System.out.println("No se halló la lista.");
        }
    }

    public void baja(String nombreLista, String id) {
        int res;
        ListaDatos lista = listasDatos.get(nombreLista);
        
        if(lista != null) {// si se halló la lista
            res = lista.eliminarDato(id);// devuelve la cantidad de registros eliminados (para id, debería ser 1)
            if(res > 0) {
                System.out.println("Se eliminó el registro de id: " + id);
            } else {
                System.out.println("No se pudo eliminar el registro de id: " + id);
            }
        } else {
            System.out.println("No se halló la lista.");
        }
    }

    public void modif(String nombreLista, Dato original, Dato nuevo) {
        int res;
        ListaDatos lista = listasDatos.get(nombreLista);
        
        if(lista != null) {
            res = lista.modificarDato(original, nuevo);
            if(res == 1){
                System.out.println("Se reemplazó el dato correctamente.");;
            }
        } else {
            System.out.println("No se halló el dato a reemplazar.");
        }
    }
    
    /**
     * Método que busca un valor (String) en una columna de una lista (ListaDatos).
     * 1- halla la lista según su nombre.
     * 2- halla el índice correspondiente a la columna según su nombre.
     * 3- busca el valor en las datos (datosAL de ListaDatos) según el índice.
     * 4- devuelve las datos halladas (un ArrayList de tipo Dato).
     * 
     * @param nombreLista nombre de la lista a consultar (ListaDatos)
     * @param id id del dato a consultar
     * @return fila(s) hallada(s) o ArrayList vacío (ArrayList de Dato)
     */
    public ArrayList<Dato> consulta(String nombreLista, String id) {
        ListaDatos lista = listasDatos.get(nombreLista);// **1**

        return lista.buscarDatos(id);// **4**
    }
    public ArrayList<Dato> consulta(String nombreLista, Integer valor) {
        return consulta(nombreLista, valor.toString());
    }
}