package gestormundomarino.manejadorbd;

import gestormundomarino.datos.Dato;
import java.util.ArrayList;

public interface ManejadorBD {
    public void alta(String tabla, Dato dato);
    public void baja(String tabla, String id);
    public void modif(String tabla, Dato original, Dato nuevo);
    public ArrayList consulta(String tabla, String id);
    public void crearListaDatos(String tabla);
}