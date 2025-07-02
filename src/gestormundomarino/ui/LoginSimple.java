package gestormundomarino.ui;

import gestormundomarino.entradasalida.EntradaSalida;
import gestormundomarino.manejadorbd.ManejadorBD;

public class LoginSimple {
    private final EntradaSalida iu;
    private final ManejadorBD bd;

    public LoginSimple(EntradaSalida iu, ManejadorBD bd) {
        this.iu = iu;
        this.bd = bd;
    }

    public String autenticarUsuario() {
        String usuario = iu.solicitarEntrada("Ingrese su usuario");
        String clave = iu.solicitarEntrada("Ingrese su clave");

        if (bd.validarUsuario(usuario, clave)) {
            return bd.obtenerTipoUsuario(usuario);
        } else {
            iu.mostrarMensaje("Usuario o clave incorrectos.");
            return null;
        }
    }
}