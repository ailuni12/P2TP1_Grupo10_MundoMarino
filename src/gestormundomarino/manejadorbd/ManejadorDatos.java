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
    
    public ArrayList<Dato> consulta(String nombreLista, String id) {
        ListaDatos lista = listasDatos.get(nombreLista);

        return lista.buscarDatos(id);
    }
    public ArrayList<Dato> consulta(String nombreLista, Integer valor) {
        return consulta(nombreLista, valor.toString());
    }
}