package GestorMundoMarino;

import GestorMundoMarino.ManejadorBD;

public class LoginSimple {
    private final InterfazUsuario iu;
    private final ManejadorBD bd;

    public LoginSimple(InterfazUsuario iu, ManejadorBD bd) {
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
