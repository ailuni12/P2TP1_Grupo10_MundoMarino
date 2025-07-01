package GestorMundoMarino;

import GestorMundoMarino.ManejadorBD;
import java.util.HashMap;
import java.util.Map;

public class ManejadorAL implements ManejadorBD {
    private final Map<String, String> usuarios = new HashMap<>();
    private final Map<String, String> tipos = new HashMap<>();

    public ManejadorAL() {
        usuarios.put("admin", "1234");
        tipos.put("admin", "admin");

        usuarios.put("cuidador", "1234");
        tipos.put("cuidador", "cuidador");

        usuarios.put("guia", "1234");
        tipos.put("guia", "guia");
    }

    @Override
    public boolean validarUsuario(String usuario, String clave) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(clave);
    }

    @Override
    public String obtenerTipoUsuario(String usuario) {
        return tipos.getOrDefault(usuario, null);
    }
}
