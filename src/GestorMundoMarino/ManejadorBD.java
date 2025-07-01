package GestorMundoMarino;

public interface ManejadorBD {
    boolean validarUsuario(String usuario, String clave);
    String obtenerTipoUsuario(String usuario);
}
