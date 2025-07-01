package gestormundomarino.manejadorbd;

import gestormundomarino.datos.Dato;
import java.lang.reflect.Field;
import java.util.ArrayList;

class ListaDatos {
    private String nombre;
    private ArrayList<Dato> listaDatos;

    public ListaDatos(String n) {
        nombre = n;
        listaDatos = new ArrayList<Dato>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getNombresAtributos() {// adaptado de https://www.baeldung.com/java-reflection
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
        for(i = 0; i < listaDatos.size(); i++) {// recorrer listaDatos completo (para id no haría falta)
            if(listaDatos.get(i).identificar() == Integer.parseInt(id)) {// verificar su id
                listaDatos.remove(i);// eliminar el elemento de índice i
                res++;// contar el número de elementos eliminados
            }
        }
        return res;
    }

    public int modificarDato(Dato original, Dato nuevo) {
        int i = 0, res = 0;

        i = listaDatos.indexOf(original);
        if(listaDatos.remove(i) != null) {
            listaDatos.add(i, nuevo);
            if(listaDatos.contains(nuevo)){
                res = 1;
            }
        }

        return res;
    }

    public ArrayList<Dato> buscarDatos(String id) {
        ArrayList<Dato> datosRes = new ArrayList<>();

        for(Dato dato : listaDatos) {
            if(dato.identificar() == Integer.parseInt(id)) {
                datosRes.add(dato);
            }
        }
        return datosRes;
    }
}
