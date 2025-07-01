package gestormundomarino.manejadorbd;

import java.util.ArrayList;

public interface ManejadorBD {
    public void alta(String tabla, String columna, ArrayList datoAL);
    public void baja(String tabla, String columna, String id);
    public void modif(String tabla, String columna, String id);
    public ArrayList consulta(String tabla, String columna, String valor);
}